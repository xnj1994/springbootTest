package org.spring.springboot.service.impl;

import org.spring.springboot.entity.QueryCommonRsp;
import org.spring.springboot.entity.User;
import org.spring.springboot.entity.impl.QueryUserReq;
import org.spring.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUserByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryCommonRsp<User> getUserList(QueryUserReq req) {
		// TODO Auto-generated method stub
		return null;
	}

}
