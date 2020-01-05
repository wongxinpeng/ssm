package com.situ.ssm.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.user.dao.UserDao;
import com.situ.ssm.user.domain.User;
import com.situ.ssm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Long saveUser(User user) {
		return userDao.save(user);
	}

	@Override
	public List<User> findAllUser() {
		return userDao.find();
	}

}
