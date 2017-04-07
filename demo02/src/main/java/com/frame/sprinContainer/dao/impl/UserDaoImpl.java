package com.frame.sprinContainer.dao.impl;

import com.frame.sprinContainer.beans.UserBean;
import com.frame.sprinContainer.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

	@Override
	public void addUser(UserBean user) {
        System.out.println("新增小黄哥");
	}

	@Override
	public void deleteUserById(int userId) {
		System.out.println("kill比尔");

	}

	@Override
	public UserBean findUserById(int userId) {
		System.out.println("找到小明");
		return null;
	}

	@Override
	public void changeUserById(int useId) {
       System.out.println("把奥巴马性别改为女性");
	}

}
