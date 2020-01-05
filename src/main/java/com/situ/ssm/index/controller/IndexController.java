package com.situ.ssm.index.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("/admin")
	public ModelAndView goAdmin(ModelAndView modelAndView) {
		//WEB-INF/pages/admin.jsp
		modelAndView.setViewName("admin");
		return modelAndView;
	}
	
	@RequestMapping(path = {"/","/index"})
	public ModelAndView goIndex(ModelAndView modelAndView) {
		//index = /WEB-INF/pages/+index+.jsp
		//WEB-INF/pages/index.jsp
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
