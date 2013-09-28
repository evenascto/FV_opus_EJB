package com.futurevision.rpg.bo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CharacterBOI;
import com.futurevision.rpg.dao.impl.CharacterDAO;
import com.futurevision.rpg.dao.inter.CharacterDAOI;
import com.futurevision.rpg.entity.Attribute;
import com.futurevision.rpg.entity.AttributeType;
import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Item;
import com.futurevision.rpg.util.Dice;

@Stateless
public class CharacterBO implements Serializable, CharacterBOI {
	@EJB
	private CharacterDAOI characterDao;

	public CharacterBO() {
		/*characterDao = new CharacterDAO();*/
	}
	
	@Override
	public Character generateCharacter(){
		//cria o char
		Character c= new Character();
		//configura como ativo(Vivo)
		c.setAlive(true);
		
		//configura os atributos iniciais

		AttributeType dexType = new AttributeType();
		dexType.setNome("Destreza");
		dexType.setDescription("Sua força de ataque.");
		Attribute dex = new Attribute();
		dex.setAttributeType(dexType);
		int tempValor = Dice.rollSixFacesDice() + 6;
		dex.setTotal(tempValor);
		dex.setValue(tempValor);
		
		AttributeType lifeType = new AttributeType();
		lifeType.setNome("Vida");
		lifeType.setDescription("Seus ponto de vida.");
		Attribute life = new Attribute();
		life.setAttributeType(lifeType);
		tempValor = Dice.rollSixFacesDice() + 12;
		life.setTotal(tempValor);
		life.setValue(tempValor);
		
		AttributeType luckType = new AttributeType();
		luckType.setNome("Sorte");
		luckType.setDescription("Seus ponto de sorte.");
		Attribute luck = new Attribute();
		luck.setAttributeType(luckType);
		tempValor = Dice.rollSixFacesDice() + 6;
		luck.setTotal(tempValor);
		luck.setValue(tempValor);
		
		c.setDexterity(dex);
		c.setLife(life);
		c.setLuck(luck);
		
		return c;
		
	}

	// TODO Para testes
	@Override
	public Character insertCharacter(Character c) {
		return characterDao.insert(c);
	}

	// TODO Para testes
	@Override
	public Character searchCharacterById(int id) {
		return characterDao.findById(id);
	}

	// TODO Para testes
	@Override
	public void removeCharacter(Character c) {
		if (c == null)
			return;
		characterDao.remove(c);
	}

	// TODO Para testes
	@Override
	public void updateCharacter(Character c) {
		if (c == null)
			return;
		if (c.getId() <= 0 || c.getName().equals("")) {
			return;
		}
		characterDao.update(c);
	}

	// TODO Para testes
	@Override
	public void dressEquipment(Character c, Item i) {
		if (c == null || i == null) {
			return;
		}
		switch (i.getItemType()) {
		case GLOVES:
			c.getVestiment().setGloves(i);
			break;
		case WEAPON:
			c.getVestiment().setWeapon(i);
			break;
		case HELMET:
			c.getVestiment().setHelmet(i);
			break;
		case SHIELD:
			c.getVestiment().setShield(i);
			break;
		case ARMOR:
			c.getVestiment().setArmor(i);
			break;
		case NECKLACE:
			c.getVestiment().setNecklace(i);
			break;
		}
	}

	// TODO Para testes
	@Override
	public Character receiveDamage(Character c, int qtd) {
		c.getLife().setValue(c.getLife().getValue() - qtd);
		if (c.getLife().getValue() < 1) {
			c.setAlive(false);
		}
		return c;
	}

}
