package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public abstract class BaseDAO {

	private SessionFactory sessionFactory;

	protected BaseDAO() {
	}

	protected Session getCurrentSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	protected void saveOrUpdate(Object obj) {
		getCurrentSession().saveOrUpdate(obj);
	}

	protected void merge(Object obj) {
		getCurrentSession().merge(obj);
	}

	protected void delete(Object obj) {
		getCurrentSession().delete(obj);
	}

	protected Object findById(Integer id, Class clas) {
		return getCurrentSession().get(clas.getName(), id);
	}

	protected List queryAll(String queryStr, Map<String, Object> map) {
		Query query = getCurrentSession().createQuery(queryStr);
		if (map != null) {
			for (String key : map.keySet()) {
				query.setParameter(key, map.get(key));
			}
		}
		return query.list();
	}

	protected List queryLimit(String queryStr, Map<String, Object> map,
			int from, int max) {
		Query query = getCurrentSession().createQuery(queryStr);
		for (String key : map.keySet()) {
			query.setParameter(key, map.get(key));
		}
		if (from >= 0 && max > 0) {
			query.setFirstResult(from);
			query.setMaxResults(max);
		}
		return query.list();
	}

	protected Object queryIdentity(String queryStr, Map<String, Object> map) {
		Query query = getCurrentSession().createQuery(queryStr);
		for (String key : map.keySet()) {
			query.setParameter(key, map.get(key));
		}
		return query.uniqueResult();
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
