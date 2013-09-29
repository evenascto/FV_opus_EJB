package com.futurevision.rpg.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CharacterBOI;
import com.futurevision.rpg.bo.inter.ScenarioBOI;
import com.futurevision.rpg.dao.impl.ScenarioDAO;
import com.futurevision.rpg.dao.inter.ScenarioDAOI;
import com.futurevision.rpg.entity.Character;
import com.futurevision.rpg.entity.Scenario;
import com.futurevision.rpg.entity.ScenarioSelection;

@Stateless
public class ScenarioBO implements Serializable, ScenarioBOI {
	private ScenarioDAOI scenarioDao;
	private CharacterBOI characterBO;
	private ScenarioSelection scenarioSelection;

	public ScenarioBO() {
		scenarioDao = new ScenarioDAO();
		characterBO = new CharacterBO();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.futurevision.rpg.bo.ScenarioBOI#flee()
	 */
	// TODO Para testes
	@Override
	public Scenario flee(Scenario s, Character c) {
		if (!s.getFlee())
			return s;
		characterBO.receiveDamage(c, 2);
		return getScenarioByScenarioSelection(s.getScenarioSelections().get(0));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.ScenarioBOI#getScenarioById(java.lang.Integer)
	 */
	// TODO Para testes
	@Override
	public Scenario getScenarioById(Integer id) {

		return scenarioDao.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.ScenarioBOI#getScenarioByScenarioSelection(com
	 * .futurevision.rpg.entity.ScenarioSelection)
	 */
	// TODO Para testes
	@Override
	public Scenario getScenarioByScenarioSelection(
			ScenarioSelection scenarioSelection) {
		return getScenarioById(scenarioSelection.getScenario().getId());
	}

	@Override
	public ScenarioSelection getLuckScenarioSelection() {
		if (scenarioSelection == null) {
			scenarioSelection = new ScenarioSelection();
			scenarioSelection.setDescription("Teste a sua sorte");
		}
		return scenarioSelection;
	}

}
