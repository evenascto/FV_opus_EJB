package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.Item;
@Remote
public interface ItemBOI {

	public abstract void insertItem(Item i);

	public abstract Item searchItemById(Integer id);

	public abstract void removeItem(Item i);

	public abstract void updateItem(Item i);

}