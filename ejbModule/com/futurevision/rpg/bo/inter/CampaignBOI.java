package com.futurevision.rpg.bo.inter;

import java.util.List;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.Campaign;

@Remote
public interface CampaignBOI {

	public List<Campaign> getAllCampaign() throws Exception;

	/**
	 * Insere a campanha no sistema caso algum cenário não tenha um caminho especificado a campanha não é inserida.
	 *
	 * @param c the c
	 * @return the campaign
	 */
	public Campaign insertCampaign(Campaign c);

	public Campaign searchCampaignById(int id);

	public void removeCampaign(Campaign c);

	public void updateCampaign(Campaign c);

}
