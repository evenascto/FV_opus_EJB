package com.futurevision.rpg.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.futurevision.rpg.dao.inter.DAOI;

public abstract class DAO<T, K> implements DAOI<T, K> {

	@PersistenceContext(unitName = "oracleDS")
	protected EntityManager em;

	protected Class<T> entityClass;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DAO() {
		/*
		this.entityClass = (Class) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
				*/
		this.entityClass = (Class<T>) ((ParameterizedType) getClass() 
				.getGenericSuperclass()).getActualTypeArguments()[0]; 
	}

	@Override
	public T insert(T entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public void remove(T entity) {
		em.merge(entity);
		em.remove(entity);
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	}

	@Override
	public T findById(K id) {
		return em.find(entityClass, id);
	}

}