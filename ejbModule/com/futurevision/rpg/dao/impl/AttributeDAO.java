package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.AttributeDAOI;
import com.futurevision.rpg.entity.Attribute;

@Stateless
public class AttributeDAO extends DAO<Attribute, Integer> implements
		AttributeDAOI {

}
