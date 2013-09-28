package com.futurevision.rpg.bo;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.CampaignBOI;
import com.futurevision.rpg.dao.impl.CampaignDAO;
import com.futurevision.rpg.dao.inter.CampaignDAOI;
import com.futurevision.rpg.entity.*;

public class CampaignBO implements Serializable, CampaignBOI {
	
	@EJB
	private CampaignDAOI campaignDao;

	public CampaignBO() {
		campaignDao = new CampaignDAO();
	}

	@Override
	public List<Campaign> getAllCampaign() throws Exception {
		return campaignDao.listAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.inter.CampaignBOI#insertCampaign(com.futurevision
	 * .rpg.entity.Campaign)
	 */
	// TODO Para testes
	
	public Campaign insertCampaign(Campaign c) {
		/*
		if (c == null) {
			c = new Campaign();
			return c;
		}
		// processo que verificar a RN - Cada pagina tem de um a muitos
		// caminhos.

		for (Scenario s : c.getScenarios()) {
			if (s.getScenarioSelections() == null
					|| s.getScenarioSelections().size() < 1) {
				return c;
			}
			// verifica se a opção de cenário contém um caminho válido
			for (ScenarioSelection sc : s.getScenarioSelections()) {
				if (!c.getScenarios().contains(sc.getScenario()))
					return c;
			}

		}

		return campaignDao.insert(c);
		*/
		return new Campaign();
	}
	
	// TODO Para testes
	public Campaign searchCampaignById(int id) {
		return campaignDao.findById(id);
	}

	// TODO Para testes
	public void removeCampaign(Campaign c) {
		campaignDao.remove(c);
	}

	// TODO Para testes
	public void updateCampaign(Campaign c) {
		campaignDao.update(c);
	}

}
