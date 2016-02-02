package com.chandu.forms;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm{
	
	String message;
	String userName;
	String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	

}
