package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.Party;
import com.cyrus.techsol.gov_track_ms.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    private PartyRepository partyRepository;

    public List<Party> getAllParties(){
        return partyRepository.findAll();
    }

    public Party saveParty(Party party){
        return partyRepository.save(party);
    }
}
