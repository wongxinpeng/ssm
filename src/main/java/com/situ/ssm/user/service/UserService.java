package com.situ.ssm.user.service;

import java.util.List;

import com.situ.ssm.user.domain.User;

public interface UserService {
	Long saveUser(User user);

	List<User> findAllUser();
}
