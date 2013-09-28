package com.futurevision.rpg.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.futurevision.rpg.entity.enumeration.ItemType;

/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
@SequenceGenerator(name = "ITEM_ID_GENERATOR", sequenceName = "SEQ_ITEM")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_ID_GENERATOR")
	@Column(name = "COD_ITEM")
	private Integer id;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	@Lob
	@Column(name = "AUDIO_NAME")
	private Byte[] audioName;

	private String description;

	private Boolean handle;

	@Lob
	private Byte[] img;

	private String name;

	private ItemType itemType;

	@ManyToMany(mappedBy = "items")
	private List<ItemEffect> itemEffects;

	public Item() {
	}

	public Byte[] getAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(Byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public Byte[] getAudioName() {
		return audioName;
	}

	public void setAudioName(Byte[] audioName) {
		this.audioName = audioName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getHandle() {
		return handle;
	}

	public void setHandle(Boolean handle) {
		this.handle = handle;
	}

	public Byte[] getImg() {
		return img;
	}

	public void setImg(Byte[] img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ItemEffect> getItemEffects() {
		return itemEffects;
	}

	public void setItemEffects(List<ItemEffect> itemEffects) {
		this.itemEffects = itemEffects;
	}

	public Integer getId() {
		return id;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

}