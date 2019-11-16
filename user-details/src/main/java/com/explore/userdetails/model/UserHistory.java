package com.explore.userdetails.model;

import java.util.List;

public class UserHistory {

	private User user;
	private List<Place> places;	
	
	public UserHistory() {
		super();
	}

	public UserHistory(User user, List<Place> places) {
		super();
		this.user = user;
		this.places = places;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}	
	
}
