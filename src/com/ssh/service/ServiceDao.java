package com.ssh.service;

import com.ssh.bean.User;

import net.sf.json.JSONArray;
/**
 * @title 没错 它是项目的业务方法
 * @function 由于今天要操作挺多，所以写的非常简单
 */
public interface ServiceDao {
	/**
	 * @title 增加用户的方法
	 * @param user 用户对象
	 */
	void add(User user);
	/**
	 * @param <T>
	 * @title 根据用户的id删除用户的方法
	 * @param id 用户id
	 * @param object 你需要删除的对象
	 */
	<T> void delete(Class<T> class1,int id);
	/**
	 * @param <T>
	 * @title 根据用户的id进行修改
	 * @param id 用户的id
	 * @param object 你需要修改的对象
	 */
	<T> void update(Class<T> class1,int id,User user);
	/**
	 * @title 返回所有用户的方法
	 * @param entity 你需要查找的对象
	 */
	JSONArray find(String entity);
}
