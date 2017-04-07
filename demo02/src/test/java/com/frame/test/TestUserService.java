package com.frame.test;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Before;

import com.frame.sprinContainer.service.UserService;

public class TestUserService {
   private ApplicationContext ac;
   private UserService us;
   
   @Before
   public void before(){
	  // ac = new ClassPathXmlApplicationContext();
   }
}
