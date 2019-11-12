package com.explore.userhistory.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.explore.userhistory.model.Places;

public class HistoryService {

	private HashMap<Integer, ArrayList<Places>> history = new HashMap<Integer, ArrayList<Places>>();
	
	public HistoryService() {
		ArrayList<Places> history1 = new ArrayList<Places>();
		history1.add(new Places("Gangtok", 4.4f));
		history1.add(new Places("Darjeeling", 4.5f));
		ArrayList<Places> history2 = new ArrayList<Places>();
		history2.add(new Places("Gangtok", 4.4f));
		history2.add(new Places("Darjeeling", 4.5f));
		history2.add(new Places("Kalimpong", 3.9f));
		
		history.put(1, history1);
		history.put(2, history2);
		
	}
	
	public ArrayList<Places> getUserHistory(int userId) {
		return history.get(userId);
	}
	
}
