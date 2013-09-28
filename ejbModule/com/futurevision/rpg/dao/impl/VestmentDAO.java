package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.VestmentDAOI;
import com.futurevision.rpg.entity.Vestment;

@Stateless
public class VestmentDAO extends DAO<Vestment, Integer> implements VestmentDAOI {

}
