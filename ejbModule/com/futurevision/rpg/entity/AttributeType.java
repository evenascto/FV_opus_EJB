package com.futurevision.rpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the ATTRIBUTE_TYPE database table.
 * 
 */
@Entity
@Table(name = "ATTRIBUTE_TYPE")
@SequenceGenerator(name = "ATTRIBUTE_TYPE_ID_GENERATOR", sequenceName = "SEQ_ATTRIBUTE_TYPE")
public class AttributeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATTRIBUTE_TYPE_ID_GENERATOR")
	@Column(name = "COD_ATT_TYP")
	private Integer id;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	@Lob
	@Column(name = "AUDIO_NAME")
	private Byte[] audioName;

	private String description;

	private String nome;

	public AttributeType() {
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

}