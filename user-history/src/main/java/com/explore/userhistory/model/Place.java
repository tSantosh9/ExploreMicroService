package com.explore.userhistory.model;

public class Places {

	private String name;
	private float ratings;

	public Places() {
		super();
	}

	public Places(String name, float ratings) {
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
