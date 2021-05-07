package com.cyrus.techsol.gov_track_ms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.List;

public class PoliticianDto {
    @JsonProperty(value = "politician", index = 1)
    private PoliticianCountyDto politicianCountyDto;
    private List<TermsServedDto> termsServed;
    @NonNull
    private String status;
    @NonNull
    private String statusCode;

    public PoliticianDto(PoliticianCountyDto politicianCountyDto, List<TermsServedDto> termsServed) {
        this.politicianCountyDto = politicianCountyDto;
        this.termsServed = termsServed;
    }

    public PoliticianCountyDto getPoliticianCountyDto() {
        return politicianCountyDto;
    }

    public void setPoliticianCountyDto(PoliticianCountyDto politicianCountyDto) {
        this.politicianCountyDto = politicianCountyDto;
    }

    public List<TermsServedDto> getTermsServed() {
        return termsServed;
    }

    public void setTermsServed(List<TermsServedDto> termsServed) {
        this.termsServed = termsServed;
    }

    @NonNull
    public String getStatus() {
        return status;
    }

    public void setStatus(@NonNull String status) {
        this.status = status;
    }

    @NonNull
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(@NonNull String statusCode) {
        this.statusCode = statusCode;
    }
}
