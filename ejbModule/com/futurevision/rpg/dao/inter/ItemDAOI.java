package com.futurevision.rpg.dao.inter;

import javax.ejb.Remote;

import com.futurevision.rpg.entity.Item;

@Remote
public interface ItemDAOI extends DAOI<Item, Integer> {

}
