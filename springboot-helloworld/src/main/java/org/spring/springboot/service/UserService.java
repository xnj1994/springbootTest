package org.spring.springboot.service;

import org.spring.springboot.entity.QueryCommonRsp;
import org.spring.springboot.entity.User;
import org.spring.springboot.entity.impl.QueryUserReq;

public interface UserService 
{
	public User getUserByID(int id);
	
	public QueryCommonRsp<User> getUserList(QueryUserReq req);
}
