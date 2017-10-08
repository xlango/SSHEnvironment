package com.jkx.liqian.action;

import java.util.ArrayList;
import java.util.List;

import com.jkx.liqian.dao.UserDao;
import com.jkx.liqian.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	UserDao userdao;
	private List<User> users=new ArrayList<>();
	private static final long serialVersionUID = -7393353193515578564L;

	
	public String login(){
          if(userdao.Login(user)){	
        	  ActionContext.getContext().getSession().put("user ",user );
              return SUCCESS;
          }else{
           
              return INPUT;
          }
	}
	public String add(){
		userdao.saveUser(user);
		return SUCCESS;
	}
	@Override
	public User getModel() {
		if(null==user) {
			user=new User();
		}
		return user;
	}
	public void setUserDao(UserDao userdao) {
		// TODO Auto-generated method stub
		this.userdao=userdao;

	}
	public List<User> getUsers(){
		return users;
	}


	
}
