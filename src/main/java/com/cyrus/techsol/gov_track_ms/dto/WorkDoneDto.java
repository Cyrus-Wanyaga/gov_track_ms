package com.cyrus.techsol.gov_track_ms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class WorkDoneDto {
    private Integer id;
    private String title;
    private String description;
    private String progress;
    private String progressDescription;
    private Date dateInitiated;
    private Date dateWorkStarted;
    private Date dateWorkCompleted;
    private Integer politicianId;
    private Integer termId;
//    @JsonProperty(value = "politician")
//    private PoliticianCountyDto politicianCountyDto;
    @JsonProperty(value = "termServed")
    private TermsServedDto termsServedDto;
    private String sourceMediaType;
    private String sourceLink;
    private String workCategory;
    private Boolean workCompleted;

    public WorkDoneDto(Integer id, String title, String description, String progress,
                       String progressDescription, Date dateInitiated, Date dateWorkStarted,
                       Date dateWorkCompleted, Integer politicianId, Integer termId,
                       String sourceMediaType, String sourceLink, String workCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.progress = progress;
        this.progressDescription = progressDescription;
        this.dateInitiated = dateInitiated;
        this.dateWorkStarted = dateWorkStarted;
        this.dateWorkCompleted = dateWorkCompleted;
        this.politicianId = politicianId;
        this.termId = termId;
        this.sourceMediaType = sourceMediaType;
        this.sourceLink = sourceLink;
        this.workCategory = workCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getProgressDescription() {
        return progressDescription;
    }

    public void setProgressDescription(String progressDescription) {
        this.progressDescription = progressDescription;
    }

    public Date getDateInitiated() {
        return dateInitiated;
    }

    public void setDateInitiated(Date dateInitiated) {
        this.dateInitiated = dateInitiated;
    }

    public Date getDateWorkStarted() {
        return dateWorkStarted;
    }

    public void setDateWorkStarted(Date dateWorkStarted) {
        this.dateWorkStarted = dateWorkStarted;
    }

    public Date getDateWorkCompleted() {
        return dateWorkCompleted;
    }

    public void setDateWorkCompleted(Date dateWorkCompleted) {
        this.dateWorkCompleted = dateWorkCompleted;
    }

    public Integer getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(Integer politicianId) {
        this.politicianId = politicianId;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

//    public PoliticianCountyDto getPoliticianCountyDto() {
//        return politicianCountyDto;
//    }
//
//    public void setPoliticianCountyDto(PoliticianCountyDto politicianCountyDto) {
//        this.politicianCountyDto = politicianCountyDto;
//    }

    public TermsServedDto getTermsServedDto() {
        return termsServedDto;
    }

    public void setTermsServedDto(TermsServedDto termsServedDto) {
        this.termsServedDto = termsServedDto;
    }

    public String getSourceMediaType() {
        return sourceMediaType;
    }

    public void setSourceMediaType(String sourceMediaType) {
        this.sourceMediaType = sourceMediaType;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public String getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
    }

    public Boolean getWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(Boolean workCompleted) {
        this.workCompleted = workCompleted;
    }
}
