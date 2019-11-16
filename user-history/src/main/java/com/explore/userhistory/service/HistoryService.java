package com.explore.userhistory.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.explore.userhistory.model.Place;

public class HistoryService {

	private HashMap<Integer, ArrayList<Place>> history = new HashMap<Integer, ArrayList<Place>>();
	
	public HistoryService() {
		ArrayList<Place> history1 = new ArrayList<Place>();
		history1.add(new Place("Gangtok", 4.4f));
		history1.add(new Place("Darjeeling", 4.5f));
		ArrayList<Place> history2 = new ArrayList<Place>();
		history2.add(new Place("Gangtok", 4.4f));
		history2.add(new Place("Darjeeling", 4.5f));
		history2.add(new Place("Kalimpong", 3.9f));
		
		history.put(1, history1);
		history.put(2, history2);
		
	}
	
	public ArrayList<Place> getUserHistory(int userId) {
		return history.get(userId);
	}
	
}
