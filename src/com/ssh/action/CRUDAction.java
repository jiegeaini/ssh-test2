package com.ssh.action;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.bean.User;
import com.ssh.service.ServiceDao;
import net.sf.json.JSONArray;
/**
 * @title ���ڲ�����ɾ�Ĳ�Ľӿ�
 * @author jiege
 */
@Namespace("/")
@ParentPackage("struts-default")
@Results({@Result(name="index", location="/index.jsp")})
public class CRUDAction extends ActionSupport{
	@Autowired
	private User user;
	@Resource(name="service")
	private ServiceDao dao;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @title ��������û�
	 * @return �����󷵻���ҳ
	 */
	@Action("add")
	public String add() {
		dao.add(user);
		return "index";
	}
	/**
	 * @title ����ɾ���û�
	 * @return ɾ����󷵻���ҳ
	 */
	@Action("delete")
	public String delete() {
		dao.delete(User.class, user.getId());
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().println("haha");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * @title ���ڸ����û�
	 * @return ������󷵻���ҳ
	 */
	@Action("update")
	public String update() {
		dao.update(User.class, user.getId(),user);
		return "index";
	}
	/**
	 * @title ���ڷ��������û�
	 * @return ������󷵻���ҳ
	 */
	@Action("find")
	public String find() {
		JSONArray array = dao.find("User");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().println(array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the dao
	 */
	public ServiceDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(ServiceDao dao) {
		this.dao = dao;
	}


}
