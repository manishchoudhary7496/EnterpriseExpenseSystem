package com.ExpenseManagementSystem.api.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ExpenseManagementSystem.api.service.MasterService;

@RestController
@RequestMapping(path = "/ExpenseManagementSystem/v1/api/master")
public class MasterController {

	@Autowired
	private MasterService masterService;    
	
	@RequestMapping(path = "/getMasterItemList",method = RequestMethod.GET )
	public List<String> returnItemListHandler() {
		
	   List<String> itemList = new ArrayList<String>();
	
	   itemList = masterService.getItemListService();
	   
	   return itemList;
	   
	}
	
	
}
