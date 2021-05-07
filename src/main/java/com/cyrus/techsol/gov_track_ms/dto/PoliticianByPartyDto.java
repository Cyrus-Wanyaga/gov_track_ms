package com.cyrus.techsol.gov_track_ms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoliticianByPartyDto {
    private String party;
    private String partyShortHand;
    private String partyLogoUrl;
    private Integer politicianId;
    @JsonProperty(value = "politician")
    private PoliticianCountyDto politicianCountyDto;

    public PoliticianByPartyDto(String party, String partyShortHand, String partyLogoUrl, Integer politicianId) {
        this.party = party;
        this.partyShortHand = partyShortHand;
        this.partyLogoUrl = partyLogoUrl;
        this.politicianId = politicianId;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPartyShortHand() {
        return partyShortHand;
    }

    public void setPartyShortHand(String partyShortHand) {
        this.partyShortHand = partyShortHand;
    }

    public String getPartyLogoUrl() {
        return partyLogoUrl;
    }

    public void setPartyLogoUrl(String partyLogoUrl) {
        this.partyLogoUrl = partyLogoUrl;
    }

    public Integer getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(Integer politicianId) {
        this.politicianId = politicianId;
    }

    public PoliticianCountyDto getPoliticianCountyDto() {
        return politicianCountyDto;
    }

    public void setPoliticianCountyDto(PoliticianCountyDto politicianCountyDto) {
        this.politicianCountyDto = politicianCountyDto;
    }
}
