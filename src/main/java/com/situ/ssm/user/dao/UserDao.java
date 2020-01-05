package com.situ.ssm.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.situ.ssm.user.domain.User;

@Repository
public interface UserDao {
	Long save(User user);

	List<User> find();
}
