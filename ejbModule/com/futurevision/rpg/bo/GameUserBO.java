package com.futurevision.rpg.bo;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.futurevision.rpg.bo.inter.GameUserBOI;
import com.futurevision.rpg.dao.impl.GameUserDAO;
import com.futurevision.rpg.dao.inter.GameUserDAOI;
import com.futurevision.rpg.entity.GameUser;

@Stateless
public class GameUserBO implements Serializable, GameUserBOI {
	@EJB
	private GameUserDAOI gameUserDao;

	public GameUserBO() {
		/*gameUserDao = new GameUserDAO();*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameUserBOI#insertGameUser(com.futurevision.rpg
	 * .entity.GameUser)
	 */
	@Override
	public void insertGameUser(GameUser gu) {
		if (gu.getName().equals("") || gu.getPassword().equals("")
				|| gu.getUsername().equals("")) {
			return;
		}
		gameUserDao.insert(gu);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameUserBOI#searchGameUserById(java.lang.Long)
	 */
	// TODO Para testes
	@Override
	public GameUser searchGameUserById(Integer id) {
		return gameUserDao.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameUserBOI#removeGameUser(com.futurevision.rpg
	 * .entity.GameUser)
	 */
	@Override
	public void removeGameUser(GameUser gu) {
		gameUserDao.remove(gu);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.futurevision.rpg.bo.GameUserBOI#updateGameUser(com.futurevision.rpg
	 * .entity.GameUser)
	 */
	@Override
	public void updateGameUser(GameUser gu) {
		if (gu.getName().equals("") || gu.getPassword().equals("")
				|| gu.getUsername().equals("") || gu.getId() == null) {
			return;
		}
		gameUserDao.update(gu);
	}

	// TODO para testes
	@Override
	public GameUser login(GameUser gu) {
		return gameUserDao.findByLoginPassword(gu);
	}
}
