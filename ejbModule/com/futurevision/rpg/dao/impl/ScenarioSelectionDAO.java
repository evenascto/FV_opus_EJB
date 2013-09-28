package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.ScenarioSelectionDAOI;
import com.futurevision.rpg.entity.ScenarioSelection;

@Stateless
public class ScenarioSelectionDAO extends DAO<ScenarioSelection, Integer>
		implements ScenarioSelectionDAOI {

}
