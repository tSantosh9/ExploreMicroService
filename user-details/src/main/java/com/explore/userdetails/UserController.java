package com.explore.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.explore.userdetails.model.User;
import com.explore.userdetails.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userDetailService;
	
	@RequestMapping(value = "/{userid}", method = RequestMethod.GET)
	public User getUser(@PathVariable int userid) {
		System.out.println("Got a request for user : " + userid);
		return null;
	}
	
}
