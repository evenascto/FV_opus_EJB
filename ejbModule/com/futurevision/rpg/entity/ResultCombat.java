package com.futurevision.rpg.entity;

import java.io.Serializable;
import java.util.Map;

public class ResultCombat implements Serializable {

	private Map<Character, Integer> chars;
	private Character charWinner;

	public Map<Character, Integer> getChars() {
		return chars;
	}

	public void setChars(Map<Character, Integer> chars) {
		this.chars = chars;
	}

	public Character getCharWinner() {
		return charWinner;
	}

	public void setCharWinner(Character charWinner) {
		this.charWinner = charWinner;
	}

}
