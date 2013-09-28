package com.futurevision.rpg.dao.inter;

import javax.ejb.Remote;
import com.futurevision.rpg.entity.Attribute;

@Remote
public interface AttributeDAOI extends DAOI<Attribute, Integer> {

}
