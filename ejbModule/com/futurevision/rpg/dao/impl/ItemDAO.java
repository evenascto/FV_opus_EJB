package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.ItemDAOI;
import com.futurevision.rpg.entity.Item;


@Stateless
public class ItemDAO extends DAO<Item, Integer> implements ItemDAOI {

}
