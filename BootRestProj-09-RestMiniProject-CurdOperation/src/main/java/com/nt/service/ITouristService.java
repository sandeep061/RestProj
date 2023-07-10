package com.nt.service;

import java.util.List;

import com.nt.entity.Tourist;
import com.nt.exception.TouristNotFoundException;

public interface ITouristService {
  
	public String registerTourist(Tourist torest);
	//fetch all tourist
	public List<Tourist> fethAllTourist();
	//fetch Tourist by id
	public Tourist fetchTouristById(Integer id);
	//fetch Tourist by name
		public List<Tourist> fetchTouristByName(String name) throws TouristNotFoundException;
		
		//PerformUpdate operation
		public String updateTouristDetails(Tourist tour)throws TouristNotFoundException;
		//perform partial modification
		public String updateTourist(Integer id,String name);
}
