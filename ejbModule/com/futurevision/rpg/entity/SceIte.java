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
@Table(name = "SCE_ITE")
@SequenceGenerator(name = "SCE_ITE_GENERATOR", sequenceName = "SEQ_SCE_ITE")
public class SceIte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCE_ITE_GENERATOR")
	@Column(name = "SCE_ITE_ITE")
	private Integer id;

	private Long quantity;

	@ManyToOne
	private Item item;

	public SceIte() {
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getId() {
		return id;
	}

}