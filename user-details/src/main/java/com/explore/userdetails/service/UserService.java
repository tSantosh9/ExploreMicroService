package com.explore.userdetails.service;

import java.util.HashMap;

import com.explore.userdetails.model.User;

public class UserService {

	private HashMap<Integer, User> users = new HashMap<Integer, User>();
	
	public UserService() {
		users.put(1, new User(1, "Santosh", "Thapa"));
		users.put(2, new User(2, "Akriti", "Rai"));
	}
	
	public User getUser(int userid) {
		return users.get(userid);
	}
	
}
