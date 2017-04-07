package com.frame.sprinContainer.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
	private int userId;
	private String userName;
	private String userGender;
	private int userAge;

	public UserBean(int userId, String userName, String userGender, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userGender = userGender;
		this.userAge = userAge;
	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", userGender=" + userGender + ", userAge="
				+ userAge + "]";
	}

}
