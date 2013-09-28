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
@Table(name = "CHA_ITE")
@SequenceGenerator(name = "CHA_ITE_GENERATOR", sequenceName = "SEQ_CHA_ITE")
public class ChaIte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHA_ITE_GENERATOR")
	@Column(name = "COD_CHA_ITE")
	private Integer id;

	private Long quantity;

	@ManyToOne
	private Item item;

	public ChaIte() {
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}