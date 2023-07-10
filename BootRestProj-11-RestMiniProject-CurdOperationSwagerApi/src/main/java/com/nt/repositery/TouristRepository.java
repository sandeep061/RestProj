package com.nt.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Tourist;
import com.nt.exception.TouristNotFoundException;

public interface TouristRepository extends JpaRepository<Tourist, Integer> {
    public List<Tourist> findByName(String name) throws TouristNotFoundException ;
}
