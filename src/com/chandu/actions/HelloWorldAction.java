package com.chandu.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.chandu.forms.HelloWorldForm;

public class HelloWorldAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		//String s=helloWorldForm.getUserName();
		helloWorldForm.setMessage("Welcome ");
		String uname=helloWorldForm.getUserName();
		HttpSession session = request.getSession();
		 session.setAttribute("uname",uname);
		 if (helloWorldForm.getUserName()=="chandrasekhar" && helloWorldForm.getPassword()=="chandu") {
	            return mapping.findForward("success");
	        } else {
	            return mapping.findForward("failure");
	        }
		//request.getParameter("username");
		
	}
}
