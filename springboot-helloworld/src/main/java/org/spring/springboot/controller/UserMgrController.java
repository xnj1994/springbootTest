package org.spring.springboot.controller;

import javax.websocket.server.PathParam;
import org.apache.log4j.Logger;
import org.spring.springboot.constant.ErrorCode;
import org.spring.springboot.entity.QueryCommonRsp;
import org.spring.springboot.entity.User;
import org.spring.springboot.entity.impl.QueryUserReq;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserMgrController 
{
	private static final Logger LOGGER = Logger.getLogger(UserMgrController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/UserMgr/{id}",method=RequestMethod.GET)
	public User getUserByID(@PathParam(value = "id") int id) 
	{
		LOGGER.info("query user by id,id:"+id);
		return userService.getUserByID(id);
	}
	
	@RequestMapping(value="/UserMgr/userList",method=RequestMethod.POST)
	public QueryCommonRsp<User> getUserList(@RequestBody QueryUserReq req)
	{
		LOGGER.info("query userlist start;");
		QueryCommonRsp<User> rsp = new QueryCommonRsp<User>();
		if(null == req) 
		{
			rsp.setRetCode(ErrorCode.REQ_NULL_CODE);
			rsp.setRetDesc(ErrorCode.REQ_NULL_DESC);
			return rsp;
		}
		else 
		{
			LOGGER.info("query user list,req:"+req.toString());
		}
		return userService.getUserList(req);
	}
}
