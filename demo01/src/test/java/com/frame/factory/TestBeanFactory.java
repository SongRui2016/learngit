package com.frame.factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.frame.factory.interfaces.IPeopleService;
import com.frame.factory.interfaces.impl.GSPeopleServiceImpl;

import junit.framework.Assert;

public class TestBeanFactory {
	
	private BeanFactory factory;
	
	@Before
	public void before(){
		System.out.println("1");
	}
	@Test
	public void testGetBean(){
		IPeopleService person = (IPeopleService) factory.getBean("com.frame.factory.interfaces.impl.SCPeopleServiceImpl");
	    
		Assert.assertNotNull(person);
		Assert.assertEquals(1,3-1);
	}
	
	@Ignore
	public void testGetBean2(){
		System.out.println("222");
	}
	
	@After
	public void after(){
		System.out.println("01");
	}
	
	
	public static void main(String[] args) {
		GSPeopleServiceImpl gs;
		gs = (GSPeopleServiceImpl) BeanFactory.getBean("com.frame.factory.interfaces.impl.GSPeopleServiceImpl");
	    gs.hoby();
	}
}
