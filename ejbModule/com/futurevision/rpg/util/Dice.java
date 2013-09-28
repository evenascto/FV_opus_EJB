package com.futurevision.rpg.util;

public class Dice {

	public static int rollDice(int faces, int qtd) {
		int result = 0;
		for (int i = 0; i < qtd; i++) {
			result += ((int) (1 + Math.random() * faces));
		}
		return result;
	}

	public static int rollSixFacesDice() {
		return rollDice(6, 1);
	}

}
