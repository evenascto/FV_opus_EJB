package com.futurevision.rpg.bo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.ItemBOI;
import com.futurevision.rpg.dao.impl.ItemDAO;
import com.futurevision.rpg.dao.inter.GameUserDAOI;
import com.futurevision.rpg.dao.inter.ItemDAOI;
import com.futurevision.rpg.entity.Item;

@Stateless
public class ItemBO implements Serializable, ItemBOI {
	@EJB
	private ItemDAOI itemDAO;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.ItemBOI#insertItem(com.futurevision.rpg.entity
	 * .Item)
	 */
	@Override
	// TODO Para testes
	public void insertItem(Item i) {
		itemDAO.insert(i);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.futurevision.rpg.bo.ItemBOI#searchItemById(java.lang.Integer)
	 */
	@Override
	// TODO Para testes
	public Item searchItemById(Integer id) {
		return itemDAO.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.ItemBOI#removeItem(com.futurevision.rpg.entity
	 * .Item)
	 */
	@Override
	// TODO Para testes
	public void removeItem(Item i) {
		itemDAO.remove(i);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.ItemBOI#updateItem(com.futurevision.rpg.entity
	 * .Item)
	 */
	@Override
	// TODO Para testes
	public void updateItem(Item i) {
		if(i.getDescription().equals("") || i.getId() == 0 || i.getName().equals("")){
			return;
		}
		itemDAO.update(i);
	}

}
