package com.futurevision.rpg.entity.enumeration;

public enum ItemType {
	GLOVES("Gloves"), WEAPON("Weapon"), HELMET("Helmet"), SHIELD("Shield"), ARMOR(
			"Armor"), NECKLACE("Necklace") ;

	private String label;

	ItemType(String s) {
		this.label = s;
	}

}
