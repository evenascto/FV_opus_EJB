package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.GameUser;
import com.futurevision.rpg.entity.Item;
import com.futurevision.rpg.entity.ResultCombat;
import com.futurevision.rpg.entity.Scenario;

@Remote
public interface GameBOI {

	public abstract Scenario testLuck(Scenario s, Character c);

	public abstract ResultCombat combat(Character char1, Character char2);

	public abstract boolean testDexterity(Character c);

}