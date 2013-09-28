package com.futurevision.rpg.dao.inter;

public interface DAOI<T, K> {

	T insert(T entity);

	void remove(T entity);

	void update(T entity);

	T findById(K id);
}