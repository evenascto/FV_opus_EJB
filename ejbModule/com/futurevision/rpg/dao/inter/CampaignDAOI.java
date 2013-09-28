package com.futurevision.rpg.dao.inter;

import java.util.List;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.Campaign;

@Remote
public interface CampaignDAOI extends DAOI<Campaign, Integer> {
	
	public List<Campaign> listAll() throws Exception;

}
