package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Scenario;
import com.futurevision.rpg.entity.ScenarioSelection;

@Remote
public interface ScenarioBOI {

	public abstract Scenario flee(Scenario s, Character c);

	public abstract Scenario getScenarioById(Integer id);

	public abstract Scenario getScenarioByScenarioSelection(
			ScenarioSelection scenarioSelection);

	ScenarioSelection getLuckScenarioSelection();

}