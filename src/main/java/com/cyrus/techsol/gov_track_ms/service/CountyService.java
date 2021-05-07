package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.County;
import com.cyrus.techsol.gov_track_ms.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountyService {
    @Autowired
    CountyRepository countyRepository;

    public List<County> getAllCounties(){
        return countyRepository.findAll();
    }

    public County findCountyById(Integer id){
        return countyRepository.findById(id).get();
    }
}
