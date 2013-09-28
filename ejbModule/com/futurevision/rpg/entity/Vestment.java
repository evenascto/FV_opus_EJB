package com.futurevision.rpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VESTMENT")
@SequenceGenerator(name = "VESTMENT_ID_GENERATOR", sequenceName = "SEQ_VESTMENT")
public class Vestment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VESTMENT_ID_GENERATOR")
	@Column(name = "COD_VES")
	private int id;

	private Item gloves;
	private Item weapon;
	private Item helmet;
	private Item shield;
	private Item armor;
	private Item necklace;

	public Item getGloves() {
		return gloves;
	}

	public void setGloves(Item gloves) {
		this.gloves = gloves;
	}

	public Item getWeapon() {
		return weapon;
	}

	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public Item getHelmet() {
		return helmet;
	}

	public void setHelmet(Item helmet) {
		this.helmet = helmet;
	}

	public Item getShield() {
		return shield;
	}

	public void setShield(Item shield) {
		this.shield = shield;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Item armor) {
		this.armor = armor;
	}

	public Item getNecklace() {
		return necklace;
	}

	public void setNecklace(Item necklace) {
		this.necklace = necklace;
	}

}
