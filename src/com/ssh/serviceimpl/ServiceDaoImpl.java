package com.ssh.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssh.bean.User;
import com.ssh.dao.DBDao;
import com.ssh.service.ServiceDao;

import net.sf.json.JSONArray;

/**
 * @title 业务接口的实现类
 * @author jiege
 *
 */
@Service("service")
public class ServiceDaoImpl implements ServiceDao{
	//注入dao层
	@Resource(name="dbdao")
	private DBDao dao;
	@Override
	public void add(User user) {
		dao.save(user);
	}
	@Override
	public <T> void delete(Class<T> class1, int id) {
		User entity = (User) dao.get(class1, id);
		dao.delete(entity);
	}
	@Override
	public <T> void update(Class<T> class1, int id,User user) {
		User entity = (User) dao.get(class1, id);
		entity.setName(user.getName());
		entity.setPassword(user.getPassword());
		entity.setPhone(user.getPhone());
		entity.setStory(user.getStory());
		dao.update(entity);
	}
	@Override
	public JSONArray find(String entity) {
		List list = dao.find("from "+entity);
		JSONArray array = JSONArray.fromObject(list);
		return array;
	}

	/**
	 * @return the dao
	 */
	public DBDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(DBDao dao) {
		this.dao = dao;
	}

}
