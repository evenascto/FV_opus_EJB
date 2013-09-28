package com.futurevision.rpg.dao.inter;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.GameUser;

@Remote
public interface GameUserDAOI extends DAOI<GameUser, Integer> {

	public GameUser findByLoginPassword(GameUser gu);

}
