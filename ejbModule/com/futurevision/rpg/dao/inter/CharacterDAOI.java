package com.futurevision.rpg.dao.inter;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.Character;

@Remote
public interface CharacterDAOI extends DAOI<Character, Integer> {

}
