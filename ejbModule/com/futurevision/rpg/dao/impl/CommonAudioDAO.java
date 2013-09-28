package com.futurevision.rpg.dao.impl;

import javax.ejb.Stateless;

import com.futurevision.rpg.dao.inter.CommonAudioDAOI;
import com.futurevision.rpg.entity.CommonAudio;


@Stateless
public class CommonAudioDAO extends DAO<CommonAudio, Integer> implements
		CommonAudioDAOI {

}
