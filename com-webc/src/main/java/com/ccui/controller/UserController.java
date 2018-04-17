package com.ccui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ccui.domain.Result;
import com.ccui.po.TbUser;
import com.ccui.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Reference
	private UserService userService;

	@RequestMapping("/regist")
	public Result regist(TbUser user) {
		try {
			System.out.println("com-controller-regist(TbUser user)");
			userService.regist(user);
			return new Result(true, "注册成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "注册失败");
		}
	}
}
