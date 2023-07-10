package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.exception.TouristNotFoundException;
import com.nt.repositery.TouristRepository;
@Service
public class TouristServiceImpl implements ITouristService {
  @Autowired
	   private TouristRepository repo;
	@Override
	public String registerTourist(Tourist torest) {
	int id=	repo.save(torest).getTid();
		return " Tourist is register with this id val "+id;
	}
	@Override
	public List<Tourist> fethAllTourist() {
		
		return repo.findAll();
	}
	@Override
	public Tourist fetchTouristById(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("This id of Tourist is not found"));
	}
	@Override
	public List<Tourist> fetchTouristByName(String name) throws TouristNotFoundException {
		
		return repo.findByName(name);
	}
	@Override
	public String updateTouristDetails(Tourist tour) throws TouristNotFoundException {
	   Optional<Tourist>opt=repo.findById(tour.getTid());
	   if(opt.isPresent()) {
		   repo.save(tour);//save tourist is not avalable or update
		   return tour.getTid()+" is tourist update";
	   }
	   else {
		 throw new TouristNotFoundException(tour.getTid()+"tourist is not found");   
	   }
		
	}
	@Override
	public String updateTourist(Integer id, String name) {
		Optional< Tourist>opt=repo.findById(id);
		if(opt.isPresent()) {
			Tourist tou=opt.get();
			tou.setName(name);
			repo.save(tou);
			return "tourist update";
		}
		else
		return "Tourest is not found ";
	}
	

}
