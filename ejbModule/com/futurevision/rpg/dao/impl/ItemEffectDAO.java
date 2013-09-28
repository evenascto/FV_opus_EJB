package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.ItemEffectDAOI;
import com.futurevision.rpg.entity.ItemEffect;

@Stateless
public class ItemEffectDAO extends DAO<ItemEffect, Integer> implements
		ItemEffectDAOI {

}
