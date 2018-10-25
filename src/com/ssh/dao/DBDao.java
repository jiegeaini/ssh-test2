package com.ssh.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @title 用于操作数据库的dao
 * @function 用于hibernate增删改查方法
 * @author jiege
 */
public interface DBDao {
	/**
	 * @title 用来增加对象的操作
	 * @function 把传来的对象进行增加
	 * @param entity 想要增加的对象
	 */
	Serializable save(Object entity);
	/**
	 * @title 用来删除对象的操作
	 * @function 把传来的对象进行删除
	 * @param entity 想要删除的对象
	 */
	void delete(Object entity);
	/**
	 * @title 用来更新对象的操作
	 * @function 把传来的对象进行更新
	 * @param entity 想要更新的对象
	 */
	void update(Object entity);
	/**
	 * @title 用来根据对象id查找的操作
	 * @function 把传来的对象及对象id做一个查找
	 * @param entityClass 类 
	 * id 需要查询的id
	 */
	<T> T get(Class<T> entityClass, Serializable id);
	/**
	 * @title 用来根据hql语句来查找的操作
	 * @function 把传来的hql语句做一个查找，返回list集合
	 * @param queryString 查询的hql语句
	 * @param strings 问号的数组
	 */
	List find(String queryString, String[] strings);
	/**
	 * @title 用来查询所有对象的操作
	 * @function 把传来的获取来语句来查找
	 * @param querystring hql语句
	 */
	List find(String queryString);
}
