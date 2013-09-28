package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;

import com.futurevision.rpg.dao.inter.GameUserDAOI;
import com.futurevision.rpg.entity.GameUser;

@Stateless
public class GameUserDAO extends DAO<GameUser, Integer> implements GameUserDAOI {

	@Override
	public GameUser findByLoginPassword(GameUser gu) {
		TypedQuery<GameUser> q = em.createNamedQuery(
				"GameUser.findByLoginPassword", GameUser.class);
		q.setParameter("name", gu.getName());
		q.setParameter("password", gu.getPassword());
		try {
			gu = q.getSingleResult();
			gu.setAuth(true);

		} catch (EntityNotFoundException e) {
			gu.setAuth(false);
		}

		return gu;

	}

}
