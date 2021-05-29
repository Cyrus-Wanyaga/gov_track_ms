package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.PoliticianDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.dto.TopPositionsPoliticiansDto;
import com.cyrus.techsol.gov_track_ms.entities.Politician;
import com.cyrus.techsol.gov_track_ms.repository.PoliticianRepository;
import com.cyrus.techsol.gov_track_ms.utils.CalculateAge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PoliticianService {
    @Autowired
    PoliticianRepository politicianRepository;
    @Autowired
    private TermsServedService termsServedService;
    @Autowired
    private CalculateAge calculateAge;

    public List<PoliticianCountyDto> getAllPoliticians() {
        List<PoliticianCountyDto> politicians = politicianRepository.getAllPoliticians();

        for (PoliticianCountyDto politician : politicians) {
            politician.setAge(calculateAge.getAge(politician.getDateOfBirth()));
        }

        return politicians;
    }

    public PoliticianDto getPoliticianById(Integer id) {
        PoliticianCountyDto politicians = politicianRepository.getPoliticianById(id);
        politicians.setAge(calculateAge.getAge(politicians.getDateOfBirth()));

        List<TermsServedDto> termsServedList = termsServedService.findTermsByPoliticianId(id);

        PoliticianDto politicianDto = new PoliticianDto(politicians, termsServedList);
        if(politicianDto.getPoliticianCountyDto() == null){
            politicianDto.setStatus("No matching records found");
            politicianDto.setStatusCode("5000");
        } else {
            politicianDto.setStatus("Success");
            politicianDto.setStatusCode("200");
        }

        return politicianDto;
    }

    public List<PoliticianCountyDto> getPoliticiansByCounty(String county){
        List<PoliticianCountyDto> politicianCountyDtoList = politicianRepository.getPoliticianByCounty(county);

        for (PoliticianCountyDto politician : politicianCountyDtoList) {
            politician.setAge(calculateAge.getAge(politician.getDateOfBirth()));
        }

        return politicianCountyDtoList;
    }

    public List<PoliticianCountyDto> getPoliticiansByLeadershipPosition(String leadershipPosition){
        List<PoliticianCountyDto> politicianCountyDtoList = politicianRepository.getPoliticianByLeadershipPosition(leadershipPosition);

        for (PoliticianCountyDto politician : politicianCountyDtoList) {
            politician.setAge(calculateAge.getAge(politician.getDateOfBirth()));
        }

        return politicianCountyDtoList;
    }

    public List<TopPositionsPoliticiansDto> getTopPositionsPoliticians(){
        List<TopPositionsPoliticiansDto> topPositionsPoliticiansDtoList = politicianRepository.getTopPositions();
        for(TopPositionsPoliticiansDto topPositionsPoliticiansDto : topPositionsPoliticiansDtoList)
            topPositionsPoliticiansDto.setAge(calculateAge.getAge(topPositionsPoliticiansDto.getDateOfBirth()));

        return topPositionsPoliticiansDtoList;
    }

    public Politician savePolitician(Politician politician) {
        return politicianRepository.save(politician);
    }

    public List<Politician> savePoliticians(List<Politician> politicians){
        return politicianRepository.saveAll(politicians);
    }

    public String deletePolitician(Integer id){
        politicianRepository.deleteById(id);
        return "Deleted successfully";
    }
}
