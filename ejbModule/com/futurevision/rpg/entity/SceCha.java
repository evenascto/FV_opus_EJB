package com.futurevision.rpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the CHA_ITE database table.
 * 
 */
@Entity
@Table(name = "SCE_CHA")
@SequenceGenerator(name = "SCE_CHA_GENERATOR", sequenceName = "SCE_CHA_ITE")
public class SceCha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCE_CHA_GENERATOR")
	@Column(name = "SCE_CHA_ITE")
	private Integer id;

	private Long quantity;

	@ManyToOne
	private Character character;

	public SceCha() {
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Integer getId() {
		return id;
	}

}