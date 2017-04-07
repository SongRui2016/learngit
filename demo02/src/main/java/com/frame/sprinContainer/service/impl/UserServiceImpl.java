package com.frame.sprinContainer.service.impl;

import com.frame.sprinContainer.beans.UserBean;
import com.frame.sprinContainer.dao.IUserDao;
import com.frame.sprinContainer.service.UserService;

public class UserServiceImpl implements UserService {
	
	private IUserDao userDao;
	
	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void addUser(UserBean user) {
          userDao.addUser(user);
	}

	@Override
	public void deleteUserById(int userId) {
		userDao.deleteUserById(userId);

	}

	@Override
	public UserBean findUserById(int userId) {
		
		return userDao.findUserById(userId);
	}

	@Override
	public void changeUserById(int useId) {
		userDao.changeUserById(useId);

	}

}
