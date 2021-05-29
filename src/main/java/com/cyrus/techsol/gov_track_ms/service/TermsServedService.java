package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianByPartyDto;
import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.entities.TermsServed;
import com.cyrus.techsol.gov_track_ms.repository.PoliticianRepository;
import com.cyrus.techsol.gov_track_ms.repository.TermsServedRepository;
import com.cyrus.techsol.gov_track_ms.utils.CalculateAge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TermsServedService {
    @Autowired
    private TermsServedRepository termsServedRepository;
    @Autowired
    private PoliticianRepository politicianRepository;
    @Autowired
    private CalculateAge calculateAge;

    public List<TermsServedDto> findTermsByPoliticianId(Integer id) {
        List<TermsServedDto> termsServedDtos = termsServedRepository.getTermsByPoliticianId(id);

        for (int i = 0; i < termsServedDtos.size(); i++) {
            System.out.println("Step " + i + " of " + termsServedDtos.size());
            termsServedDtos.get(i)
                    .setTermDuration(calculateTermDuration(termsServedDtos.get(i).getEndYear(), termsServedDtos.get(i).getStartYear()));
        }

        return termsServedDtos;
    }

    public List<PoliticianByPartyDto> findPoliticiansByParty(String partyName) {
        List<PoliticianByPartyDto> politicianByPartyDtos = termsServedRepository.getPoliticiansByParty(partyName);

        for (PoliticianByPartyDto politicianByPartyDto : politicianByPartyDtos) {
            politicianByPartyDto.setPoliticianCountyDto(politicianRepository.getPoliticianById(
                    politicianByPartyDto.getPoliticianId()));
            politicianByPartyDto.getPoliticianCountyDto().setAge(calculateAge.getAge(politicianByPartyDto.getPoliticianCountyDto().getDateOfBirth()));
        }

        return politicianByPartyDtos;
    }

    public List<PoliticianCountyDto> findPoliticiansByGeographicalAreaServed(Integer geographicalAreaId) {
        List<PoliticianCountyDto> politicianCountyDtoList = new ArrayList<>();
        List<Integer> politicianIds = termsServedRepository.getPoliticianIdByGeographicalAreaServed(geographicalAreaId);
        for (int i = 0; i < politicianIds.size(); i++) {
            politicianCountyDtoList.add(i, politicianRepository.getPoliticianById(politicianIds.get(i)));
            politicianCountyDtoList.get(i).setAge(calculateAge.getAge(politicianCountyDtoList.get(i).getDateOfBirth()));
        }
        return politicianCountyDtoList;
    }

    public TermsServedDto findTermWhenWorkWasDone(Integer termId) {
        return termsServedRepository.getTermServedWhenWorkDone(termId);
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

    public String deleteTerm(Integer termId){
        termsServedRepository.deleteById(termId);
        return "Deleted successfully.";
    }
}
