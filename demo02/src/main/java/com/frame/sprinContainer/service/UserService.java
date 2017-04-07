package com.frame.sprinContainer.service;

import com.frame.sprinContainer.beans.UserBean;

public interface UserService {
	/**
	 * @param user
	 * 添加用户
	 */
	public void addUser(UserBean user);
	
	/**
	 * @param userId
	 * 根据id删除用户
	 */
	public void deleteUserById(int userId);
	
	/**
	 * 
	 * @param userId
	 * 根据id查找用户
	 * @return 用户
	 */
	public UserBean findUserById(int userId);
	
	/**
	 * 
	 * @param useId
	 * 根据id修改用户信息
	 */
	public void changeUserById(int useId);
}
