package com.situ.ssm.user.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.user.domain.User;
import com.situ.ssm.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String PAGE_USER_INDEX = "user/user_index";
	private static final String PAGE_USER_LIST = "user/user_list";
	@Autowired
	private UserService userService;

	// /user/index
	/**
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView goIndex(ModelAndView modelAndView) {
		// /WEB-INF/pages/user/user_index.jsp
		modelAndView.setViewName(PAGE_USER_INDEX);
		return modelAndView;
	}

	// @ResponseBody 表示 此方法响应ajax的请求。
	@ResponseBody
	@RequestMapping("/add")
	public Long doAddUser(User user) {
		Long rowId = userService.saveUser(user);
		return rowId;
	}

	@RequestMapping("/find")
	public ModelAndView findAllUser(ModelAndView modelAndView) {
		modelAndView.addObject("userList", userService.findAllUser());
		modelAndView.setViewName(PAGE_USER_LIST);
		return modelAndView;
	}
}
