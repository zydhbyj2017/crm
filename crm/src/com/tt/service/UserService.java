package com.tt.service;

import com.tt.domain.User;

public interface UserService {
	//登陆方法
	User	getUserByCodePassword(User u);
	//注册用户
	void saveUser(User u);
}
