package com.explore.userhistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.explore.userhistory.model.Places;
import com.explore.userhistory.service.HistoryService;

@RestController
@RequestMapping("/history")
public class UserHistoryController {

	@Autowired
	private HistoryService historyService;
	
	@RequestMapping(value = "/{userid}", method = RequestMethod.GET)
	public List<Places> getHistory(@PathVariable int userid) {
		return historyService.getUserHistory(userid);
	}
	
}
