package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.GeographicalArea;
import com.cyrus.techsol.gov_track_ms.repository.GeographicalAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicalAreaService {
    @Autowired
    private GeographicalAreaRepository geographicalAreaRepository;

    public List<GeographicalArea> getAllGeographicalAreas(){
        return geographicalAreaRepository.findAll();
    }
}
