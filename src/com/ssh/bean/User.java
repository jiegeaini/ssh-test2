package com.ssh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


/**
 * @title �û�ʵ�����
 * @author jiege
 */
@Component
@Entity
@Table(name = "users")
public class User {
	/**�û���id*/
	private int id;
	/**�û�������*/
	private String name;
	/**�û�������*/
	private String password;
	/**�û����ֻ���*/
	private String phone;
	/**�û��ĳ����¼�*/
	private String story;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id") 
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "name") 
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	@Column(name = "password") 
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phone
	 */
	@Column(name = "phone") 
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the story
	 */
	@Column(name = "story") 
	public String getStory() {
		return story;
	}
	/**
	 * @param story the story to set
	 */
	public void setStory(String story) {
		this.story = story;
	}



}
