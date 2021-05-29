package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianByPartyDto;
import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.entities.TermsServed;
import com.cyrus.techsol.gov_track_ms.service.TermsServedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class TermsServedController {
    @Autowired
    private TermsServedService termsServedService;

    @GetMapping("/getTermsByPoliticianId/{id}")
    private List<TermsServedDto> getTermsByPoliticianId(@PathVariable Integer id){
        return termsServedService.findTermsByPoliticianId(id);
    }

    @GetMapping("/getPoliticiansByParty/{partyName}")
    private List<PoliticianByPartyDto> getPoliticiansByParty(@PathVariable String partyName){
        return termsServedService.findPoliticiansByParty(partyName);
    }

    @GetMapping("/getPoliticiansByGeographicalAreaServed/{geographicalAreaId}")
    private List<PoliticianCountyDto> getPoliticiansByGeographicalAreaServed(@PathVariable Integer geographicalAreaId){
        return termsServedService.findPoliticiansByGeographicalAreaServed(geographicalAreaId);
    }

    @PostMapping("/saveTerm")
    private TermsServed saveTerm(@RequestBody TermsServed termServed){
        return termsServedService.saveTermServed(termServed);
    }

    @PostMapping("/saveTerms")
    private List<TermsServed> saveTerms(@RequestBody List<TermsServed> termsServed){
        return termsServedService.saveTerms(termsServed);
    }

    @PutMapping("/updateTerm")
    private TermsServed updateTerm(@RequestBody TermsServed termServed){
        return termsServedService.saveTermServed(termServed);
    }

    @DeleteMapping("/deleteTermById/{termId}")
    private String deleteTerm(@PathVariable Integer termId){
        return termsServedService.deleteTerm(termId);
    }
}
