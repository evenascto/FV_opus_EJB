package com.futurevision.rpg.bo;

import java.io.Serializable;
import java.util.HashMap;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CharacterBOI;
import com.futurevision.rpg.bo.inter.GameBOI;
import com.futurevision.rpg.bo.inter.ScenarioBOI;
import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Item;
import com.futurevision.rpg.entity.ResultCombat;
import com.futurevision.rpg.entity.Scenario;
import com.futurevision.rpg.util.Dice;

@Stateless
public class GameBO implements Serializable, GameBOI {
	@EJB
	private CharacterBOI characterBO;
	@EJB
	private ScenarioBOI scenarioBO;

	public GameBO() {
		/*characterBO = new CharacterBO();*/
		/*scenarioBO = new ScenarioBO();*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameBOI#testLuck(com.futurevision.rpg.entity.
	 * Character)
	 */
	@Override
	public Scenario testLuck(Scenario s, Character c) {
		if(!s.getLuckTest()){
			return s;
		}
		
		if (c.getLuck().getValue() < 1)
			return  scenarioBO.getScenarioByScenarioSelection(s.getScenarioSelections().get(1));

		if (c.getLuck().getValue() <= Dice.rollDice(6, 2)) {
			c.getLuck().setValue(c.getLuck().getValue() - 1);
			return scenarioBO.getScenarioByScenarioSelection(s.getScenarioSelections().get(0));
		} else {
			c.getLuck().setValue(c.getLuck().getValue() - 1);
			return scenarioBO.getScenarioByScenarioSelection(s.getScenarioSelections().get(1));

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameBOI#combat(com.futurevision.rpg.entity.Character
	 * , com.futurevision.rpg.entity.Character)
	 */
	@Override
	public ResultCombat combat(Character char1, Character char2) {
		ResultCombat rc = new ResultCombat();
		int char1Dex = char1.getDexterity().getValue();
		int char2Dex = char2.getDexterity().getValue();

		rc.setChars(new HashMap<Character, Integer>());
		rc.getChars().put(char1, char1Dex += Dice.rollDice(6, 2));
		rc.getChars().put(char2, char1Dex += Dice.rollDice(6, 2));

		if (char1Dex > char2Dex) {
			characterBO.receiveDamage(char2, 2);
			rc.setCharWinner(char1);
		} else if (char1Dex < char2Dex) {
			characterBO.receiveDamage(char1, 2);
			rc.setCharWinner(char2);
		}
		return rc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.futurevision.rpg.bo.GameBOI#testAttribute()
	 */
	@Override
	public boolean testDexterity(Character c) {
		if (c.getDexterity().getValue() < 1)
			return false;

		return c.getDexterity().getValue() <= Dice.rollSixFacesDice() ? true
				: false;
	}



}
