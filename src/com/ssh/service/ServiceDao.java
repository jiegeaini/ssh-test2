package com.ssh.service;

import com.ssh.bean.User;

import net.sf.json.JSONArray;
/**
 * @title û�� ������Ŀ��ҵ�񷽷�
 * @function ���ڽ���Ҫ����ͦ�࣬����д�ķǳ���
 */
public interface ServiceDao {
	/**
	 * @title �����û��ķ���
	 * @param user �û�����
	 */
	void add(User user);
	/**
	 * @param <T>
	 * @title �����û���idɾ���û��ķ���
	 * @param id �û�id
	 * @param object ����Ҫɾ���Ķ���
	 */
	<T> void delete(Class<T> class1,int id);
	/**
	 * @param <T>
	 * @title �����û���id�����޸�
	 * @param id �û���id
	 * @param object ����Ҫ�޸ĵĶ���
	 */
	<T> void update(Class<T> class1,int id,User user);
	/**
	 * @title ���������û��ķ���
	 * @param entity ����Ҫ���ҵĶ���
	 */
	JSONArray find(String entity);
}
