package com.ccui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.ccui.mapper.TbUserMapper;
import com.ccui.po.TbUser;
import com.ccui.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TbUserMapper userMapper;
	@Override
	public void regist(TbUser user) {
		System.out.println("com-service-regist(TbUser user)");
		userMapper.insert(user);
	}

}
