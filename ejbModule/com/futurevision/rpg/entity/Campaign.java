package com.futurevision.rpg.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * The persistent class for the CAMPAIGN database table.
 * 
 */
@Entity
@SequenceGenerator(name = "CAMPAIGN_ID_GENERATOR", sequenceName = "SEQ_CAMPAIGN")
@NamedQuery(name = "campaign.listAll", query = "select c from Campaign c")
public class Campaign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAMPAIGN_ID_GENERATOR")
	@Column(name = "COD_CAM")
	private Integer id;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	@Lob
	@Column(name = "AUDIO_TITLE")
	private Byte[] audioTitle;

	private String description;

	@Lob
	private Byte[] img;

	private String title;
/*
	@OneToMany(mappedBy = "campaign")
	private List<Scenario> scenarios;
*/
	public Campaign() {
	}

	public Byte[] getAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(Byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public Byte[] getAudioTitle() {
		return audioTitle;
	}

	public void setAudioTitle(Byte[] audioTitle) {
		this.audioTitle = audioTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getImg() {
		return img;
	}

	public void setImg(Byte[] img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
/*
	public List<Scenario> getScenarios() {
		return scenarios;
	}

	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}
*/
	public Integer getId() {
		return id;
	}

}