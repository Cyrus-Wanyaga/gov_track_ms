package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto;
import com.cyrus.techsol.gov_track_ms.entities.Politician;
import com.cyrus.techsol.gov_track_ms.entities.WorkDone;
import com.cyrus.techsol.gov_track_ms.repository.PoliticianRepository;
import com.cyrus.techsol.gov_track_ms.repository.WorkDoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class WorkDoneService {
    @Autowired
    private WorkDoneRepository workDoneRepository;
    @Autowired
    private PoliticianRepository politicianRepository;
    @Autowired
    private TermsServedService termsServedService;

    public List<WorkDone> getMostRecentWorkAdded() {
        return workDoneRepository.getMostRecentWorkDone();
    }

    public List<WorkDoneDto> getWorkDone() {
        List<WorkDoneDto> workDoneDtoList = workDoneRepository.getWorkDone();

        return getWorkDoneDtos(workDoneDtoList);
    }

    public List<WorkDoneDto> getWorkDoneByPoliticianId(Integer politicianId){
        List<WorkDoneDto> workDoneDtoList = workDoneRepository.getWorkDoneByPoliticianId(politicianId);

        return getWorkDoneDtos(workDoneDtoList);
    }

    public WorkDoneDto getWorkDoneByWorkId(Integer workId){
        WorkDoneDto workDoneDto = workDoneRepository.getWorkDoneByWorkId(workId);
        TermsServedDto termsServedDto = termsServedService.findTermWhenWorkWasDone(workDoneDto.getTermId());
        termsServedDto.setTermDuration(calculateTermDuration(termsServedDto.getEndYear(), termsServedDto.getStartYear()));
        workDoneDto.setTermsServedDto(termsServedDto);
        workDoneDto.setWorkCompleted(isWorkCompleted(workDoneDto.getDateWorkCompleted()));
        return workDoneDto;
    }

    private List<WorkDoneDto> getWorkDoneDtos(List<WorkDoneDto> workDoneDtoList) {
        for (WorkDoneDto workDoneDto : workDoneDtoList){
            TermsServedDto termServedDto = termsServedService.findTermWhenWorkWasDone(workDoneDto.getTermId());
            termServedDto.setTermDuration(calculateTermDuration(termServedDto.getEndYear(), termServedDto.getStartYear()));
            workDoneDto.setTermsServedDto(termServedDto);
            workDoneDto.setWorkCompleted(isWorkCompleted(workDoneDto.getDateWorkCompleted()));
        }

        return workDoneDtoList;
    }

    private String calculateTermDuration(Date endYear, Date startYear) {
        return Integer.toString(endYear.getYear() - startYear.getYear());
    }

    private Boolean isWorkCompleted(Date dateCompleted) {
        return dateCompleted != null;
    }

    public WorkDone saveWorkDone(WorkDone workDone) {
        return workDoneRepository.save(workDone);
    }

    public String deleteWorkDoneById(Integer id) {
        workDoneRepository.deleteById(id);
        return "Deleted successfully.";
    }
}
