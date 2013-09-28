package com.futurevision.rpg.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * The persistent class for the SCENARIO database table.
 * 
 */
@Entity
@SequenceGenerator(name = "SCENARIO_CODSCE_GENERATOR", sequenceName = "SEQ_SCENARIO")
public class Scenario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCENARIO_CODSCE_GENERATOR")
	@Column(name = "COD_SCE")
	private Integer id;

	@Column(name = "ALLOW_PROVISION")
	private Boolean allowProvision;

	private Boolean flee;

	@Column(name = "LUCK_TEST")
	private Boolean luckTest;

	@Lob
	@Column(name = "AUDIO_AMBIENCE")
	private Byte[] audioAmbience;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	private String description;

	@ManyToOne
	@JoinColumn(name = "COD_CAM")
	private Campaign campaign;

	@OneToMany
	private List<ScenarioSelection> scenarioSelections;

	@OneToMany
	@JoinColumn(name = "COD_SCE_ITE")
	private List<SceCha> sceChas;

	@OneToMany
	@JoinColumn(name = "COD_SCE_ITE")
	private List<SceIte> sceItes;

	public Scenario() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((flee == null) ? 0 : flee.hashCode());
		result = prime * result
				+ ((luckTest == null) ? 0 : luckTest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scenario other = (Scenario) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (flee == null) {
			if (other.flee != null)
				return false;
		} else if (!flee.equals(other.flee))
			return false;
		if (luckTest == null) {
			if (other.luckTest != null)
				return false;
		} else if (!luckTest.equals(other.luckTest))
			return false;
		return true;
	}

	public Byte[] getAudioAmbience() {
		return audioAmbience;
	}

	public void setAudioAmbience(Byte[] audioAmbience) {
		this.audioAmbience = audioAmbience;
	}

	public Byte[] getAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(Byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public List<ScenarioSelection> getScenarioSelections() {
		return scenarioSelections;
	}

	public void setScenarioSelections(List<ScenarioSelection> scenarioSelections) {
		this.scenarioSelections = scenarioSelections;
	}

	public List<SceCha> getSceChas() {
		return sceChas;
	}

	public void setSceChas(List<SceCha> sceChas) {
		this.sceChas = sceChas;
	}

	public List<SceIte> getSceItes() {
		return sceItes;
	}

	public void setSceItes(List<SceIte> sceItes) {
		this.sceItes = sceItes;
	}

	public Integer getId() {
		return id;
	}

	public Boolean getAllowProvision() {
		return allowProvision;
	}

	public void setAllowProvision(Boolean allowProvision) {
		this.allowProvision = allowProvision;
	}

	public Boolean getFlee() {
		return flee;
	}

	public void setFlee(Boolean flee) {
		this.flee = flee;
	}

	public Boolean getLuckTest() {
		return luckTest;
	}

	public void setLuckTest(Boolean luckTest) {
		this.luckTest = luckTest;
	}

}