package com.ssh.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @title ���ڲ������ݿ��dao
 * @function ����hibernate��ɾ�Ĳ鷽��
 * @author jiege
 */
public interface DBDao {
	/**
	 * @title �������Ӷ���Ĳ���
	 * @function �Ѵ����Ķ����������
	 * @param entity ��Ҫ���ӵĶ���
	 */
	Serializable save(Object entity);
	/**
	 * @title ����ɾ������Ĳ���
	 * @function �Ѵ����Ķ������ɾ��
	 * @param entity ��Ҫɾ���Ķ���
	 */
	void delete(Object entity);
	/**
	 * @title �������¶���Ĳ���
	 * @function �Ѵ����Ķ�����и���
	 * @param entity ��Ҫ���µĶ���
	 */
	void update(Object entity);
	/**
	 * @title �������ݶ���id���ҵĲ���
	 * @function �Ѵ����Ķ��󼰶���id��һ������
	 * @param entityClass �� 
	 * id ��Ҫ��ѯ��id
	 */
	<T> T get(Class<T> entityClass, Serializable id);
	/**
	 * @title ��������hql��������ҵĲ���
	 * @function �Ѵ�����hql�����һ�����ң�����list����
	 * @param queryString ��ѯ��hql���
	 * @param strings �ʺŵ�����
	 */
	List find(String queryString, String[] strings);
	/**
	 * @title ������ѯ���ж���Ĳ���
	 * @function �Ѵ����Ļ�ȡ�����������
	 * @param querystring hql���
	 */
	List find(String queryString);
}
