package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.PoliticianDto;
import com.cyrus.techsol.gov_track_ms.dto.TopPositionsPoliticiansDto;
import com.cyrus.techsol.gov_track_ms.entities.Politician;
import com.cyrus.techsol.gov_track_ms.service.PoliticianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class PoliticianController {
    @Autowired
    private PoliticianService politicianService;

    @GetMapping("/getAllPoliticians")
    private List<PoliticianCountyDto> getAllPoliticians() {
        return politicianService.getAllPoliticians();
    }

    @GetMapping("/getPoliticianById/{id}")
    private PoliticianDto getPoliticianById(@PathVariable Integer id) {
        return politicianService.getPoliticianById(id);
    }

    @GetMapping("/getTopPositionsPoliticians")
    private List<TopPositionsPoliticiansDto> getTopPositionsPoliticians() {
        return politicianService.getTopPositionsPoliticians();
    }

    @GetMapping("/getPoliticiansByCounty/{county}")
    private List<PoliticianCountyDto> getPoliticiansByCounty(@PathVariable String county) {
        return politicianService.getPoliticiansByCounty(county);
    }

    @GetMapping("/getPoliticiansByLeadershipPosition/{leadershipPosition}")
    private List<PoliticianCountyDto> getPoliticiansByLeadershipPosition(@PathVariable String leadershipPosition) {
        return politicianService.getPoliticiansByLeadershipPosition(leadershipPosition);
    }

    @PostMapping("/savePolitician")
    private Politician savePolitician(@RequestBody Politician politician) {
        return politicianService.savePolitician(politician);
    }

    @PutMapping("/updatePolitician")
    private Politician updatePolitician(@RequestBody Politician politician) {
        return politicianService.savePolitician(politician);
    }

    @PostMapping("savePoliticians")
    private List<Politician> savePoliticians(@RequestBody List<Politician> politicians) {
        return politicianService.savePoliticians(politicians);
    }

    @DeleteMapping("/deletePoliticianById/{id}")
    private String deletePolitician(@PathVariable Integer id) {
        return politicianService.deletePolitician(id);
    }
}
