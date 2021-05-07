package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianByPartyDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.entities.TermsServed;
import com.cyrus.techsol.gov_track_ms.repository.PoliticianRepository;
import com.cyrus.techsol.gov_track_ms.repository.TermsServedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TermsServedService {
    @Autowired
    private TermsServedRepository termsServedRepository;
    @Autowired
    private PoliticianRepository politicianRepository;

    public List<TermsServedDto> findTermsByPoliticianId(Integer id) {
        List<TermsServedDto> termsServedDtos = termsServedRepository.getTermsByPoliticianId(id);

        for (int i = 0; i < termsServedDtos.size(); i++) {
            System.out.println("Step " + i + " of " + termsServedDtos.size());
            termsServedDtos.get(i)
                    .setTermDuration(calculateTermDuration(termsServedDtos.get(i).getEndYear(), termsServedDtos.get(i).getStartYear()));
        }

        return termsServedDtos;
    }

    public List<PoliticianByPartyDto> findPoliticiansByParty(String partyName){
        List<PoliticianByPartyDto> politicianByPartyDtos = termsServedRepository.getPoliticiansByParty(partyName);

        for(int i = 0; i < politicianByPartyDtos.size(); i++){
            politicianByPartyDtos.get(i).setPoliticianCountyDto(politicianRepository.getPoliticianById(
                            politicianByPartyDtos.get(i).getPoliticianId()));
        }

        return politicianByPartyDtos;
    }

    private String calculateTermDuration(Date endYear, Date startYear) {
        return Integer.toString(endYear.getYear() - startYear.getYear());
    }

    public TermsServed saveTermServed(TermsServed termsServed) {
        return termsServedRepository.save(termsServed);
    }

    public List<TermsServed> saveTerms(List<TermsServed> termsServed) {
        return termsServedRepository.saveAll(termsServed);
    }
}
