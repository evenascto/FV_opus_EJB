package com.futurevision.rpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the SCENARIO_SELECTION database table.
 * 
 */
@Entity
@Table(name = "SCENARIO_SELECTION")
public class ScenarioSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SCENARIO_SELECTION_DI_GENERATOR", sequenceName = "SEQ_SCENARIO_SELECTION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCENARIO_SELECTION_DI_GENERATOR")
	@Column(name = "COD_SCE_SEL")
	private Integer id;

	@Lob
	@Column(name = "AUDIO_DESCRIPTION")
	private Byte[] audioDescription;

	private String description;

	@ManyToOne
	@JoinColumn(name = "COD_SCE")
	private Scenario scenario;

	public ScenarioSelection() {
	}

	public Byte[] getAudioDescription() {
		return audioDescription;
	}

	public void setAudioDescription(Byte[] audioDescription) {
		this.audioDescription = audioDescription;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Scenario getScenario() {
		return this.scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

}