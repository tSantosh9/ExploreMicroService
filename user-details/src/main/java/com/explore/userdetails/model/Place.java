package com.explore.userdetails.model;

public class Place {

	private String name;
	private float ratings;

	public Place() {
		super();
	}

	public Place(String name, float ratings) {
		super();
		this.name = name;
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}		
}
