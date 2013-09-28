package com.futurevision.rpg.dao.inter;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.Scenario;

@Remote
public interface ScenarioDAOI extends DAOI<Scenario, Integer> {

}
