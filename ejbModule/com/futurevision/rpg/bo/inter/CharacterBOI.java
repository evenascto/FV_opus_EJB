package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Item;

@Remote
public interface CharacterBOI {

	public abstract Character insertCharacter(Character c);

	public abstract Character searchCharacterById(int id);

	public abstract void removeCharacter(Character c);

	public abstract void updateCharacter(Character c);

	public abstract void dressEquipment(Character c, Item i);

	Character receiveDamage(Character c, int qtd);

	public Character generateCharacter();

}