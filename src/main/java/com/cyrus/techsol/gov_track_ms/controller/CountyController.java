package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.County;
import com.cyrus.techsol.gov_track_ms.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class CountyController {
    @Autowired
    CountyService countyService;

    @GetMapping("/getAllCounties")
    private List<County> getAllCounties(){
        return countyService.getAllCounties();
    }

    @GetMapping("/getCountyById/{id}")
    private County getCountyById(@PathVariable Integer id){
        return countyService.findCountyById(id);
    }
}
