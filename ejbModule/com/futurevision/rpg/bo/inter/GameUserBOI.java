package com.futurevision.rpg.bo.inter;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.futurevision.rpg.entity.GameUser;
@Remote
public interface GameUserBOI {

	public abstract void insertGameUser(GameUser gu);

	public abstract GameUser searchGameUserById(Integer id);

	public abstract void removeGameUser(GameUser gu);

	public abstract void updateGameUser(GameUser gu);

	public abstract GameUser login(GameUser gu);

}