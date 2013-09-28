package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.CharacterDAOI;
import com.futurevision.rpg.entity.Character;

@Stateless
public class CharacterDAO extends DAO<Character, Integer> implements
		CharacterDAOI {

}
