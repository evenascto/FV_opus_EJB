package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.ScenarioDAOI;
import com.futurevision.rpg.entity.Scenario;

@Stateless
public class ScenarioDAO extends DAO<Scenario, Integer> implements ScenarioDAOI {

}
