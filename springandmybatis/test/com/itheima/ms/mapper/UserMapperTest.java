package com.itheima.ms.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.ms.po.User;


public class UserMapperTest {
	ApplicationContext ctx;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext(
		"spring/applicationContext.xml");
	}
	@Test
	public void testFindUserById(){
		UserMapper mapper = (UserMapper) ctx.getBean("userMapper");
		User user = mapper.findUserById(1);
		System.out.println(user);
	}
}
