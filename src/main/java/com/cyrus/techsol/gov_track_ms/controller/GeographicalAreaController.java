package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.GeographicalArea;
import com.cyrus.techsol.gov_track_ms.service.GeographicalAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class GeographicalAreaController {
    @Autowired
    private GeographicalAreaService geographicalAreaService;

    @GetMapping("/getAllGeographicalAreas")
    private List<GeographicalArea> getAllGeographicalArea(){
        return geographicalAreaService.getAllGeographicalAreas();
    }
}
