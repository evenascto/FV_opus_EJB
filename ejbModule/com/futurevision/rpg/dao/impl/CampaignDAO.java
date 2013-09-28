package com.futurevision.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import com.futurevision.rpg.dao.inter.CampaignDAOI;
import com.futurevision.rpg.entity.Campaign;

@Stateless
public class CampaignDAO extends DAO<Campaign, Integer> implements CampaignDAOI {


	@Override
	public List<Campaign> listAll() throws Exception {
		 
		if(em == null) throw new Exception("ENTITY MANAGER ESTA NULO!") ;
		TypedQuery<Campaign> q = em.createNamedQuery("campaign.listAll",
				Campaign.class);
		return q.getResultList();
		
		
		/*
		// Para Testes
		List<Campaign> campaigns = new ArrayList<Campaign>();

		for (int i = 0; i < 10; i++) {
			Campaign c = new Campaign();
			c.setDescription("Description " + i);
			campaigns.add(c);
		}
		return campaigns;
		*/
	}

}
