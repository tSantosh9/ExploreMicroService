package com.explore.userdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.explore.userdetails.model.Place;
import com.explore.userdetails.model.User;
import com.explore.userdetails.model.UserHistory;
import com.explore.userdetails.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping(value = "/{userid}", method = RequestMethod.GET)
	public User getUser(@PathVariable int userid) {
		System.out.println("Got a request for user : " + userid);
		return userService.getUser(userid);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/history/{userid}", method = RequestMethod.GET)
	public UserHistory getUserHistory(@PathVariable int userid) {
		System.out.println("Got a request for user history : " + userid);
		User user = userService.getUser(userid);
		
		List<Place> places = webClientBuilder.build()
						.get()
						.uri("http://user-history/history/" + user.getUserId())
						.retrieve()
						.bodyToMono(List.class)
						.block();
		
		return new UserHistory(user, places);
	}
}
