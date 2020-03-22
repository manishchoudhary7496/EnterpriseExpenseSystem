package com.ExpenseManagementSystem.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ExpenseManagementSystem.api.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService {

	@Override
	public List<String> getItemListService() {
		 
		
		 List<String> itemList = new ArrayList<String>();
		   itemList.add("Grocery");
		   itemList.add("Education");
		   itemList.add("Utility");
		   itemList.add("Service");
		   
		   
		   return itemList;
	}

}
