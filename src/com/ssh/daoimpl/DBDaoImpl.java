package com.ssh.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ssh.dao.DBDao;
@Repository("dbdao")
public class DBDaoImpl extends HibernateTemplate implements DBDao{

	@Resource(name="sf")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	};

	@Override
	public Serializable save(Object entity) throws DataAccessException {
		return super.save(entity);
	}

	@Override
	public void delete(Object entity) throws DataAccessException {
		super.delete(entity);
	}

	@Override
	public void update(Object entity) throws DataAccessException {
		super.update(entity);
	}

	@Override
	public <T> T get(Class<T> entityClass, Serializable id) throws DataAccessException {
		return super.get(entityClass, id);
	}

	@Override
	public List find(String queryString, String[] strings) throws DataAccessException {
		return super.find(queryString,strings);
	}

	@Override
	public List find(String queryString) throws DataAccessException {
		return super.find(queryString);
	}

}
