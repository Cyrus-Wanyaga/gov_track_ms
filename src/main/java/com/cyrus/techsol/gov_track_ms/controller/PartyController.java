package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.Party;
import com.cyrus.techsol.gov_track_ms.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class PartyController {
    @Autowired
    private PartyService partyService;

    @GetMapping("/getAllPoliticalParties")
    private List<Party> getAllPoliticalParties() {
        return partyService.getAllParties();
    }
}
