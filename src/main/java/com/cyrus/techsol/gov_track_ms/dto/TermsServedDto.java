package com.cyrus.techsol.gov_track_ms.dto;

import java.util.Date;

public class TermsServedDto {
    private Integer id;
    private Date startYear;
    private Date endYear;
    private String termDuration;
    private String partyAffiliation;
    private String partyLogoUrl;
    private String partyShortHand;
    private String positionHeld;
    private String geographicalArea;
    private String areaServed;

    public TermsServedDto(Integer id, Date startYear, Date endYear, String partyAffiliation,String partyLogoUrl,
                          String partyShortHand, String positionHeld, String geographicalArea, String areaServed) {
        this.id = id;
        this.startYear = startYear;
        this.endYear = endYear;
        this.partyAffiliation = partyAffiliation;
        this.partyLogoUrl = partyLogoUrl;
        this.partyShortHand = partyShortHand;
        this.positionHeld = positionHeld;
        this.geographicalArea = geographicalArea;
        this.areaServed = areaServed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public Date getEndYear() {
        return endYear;
    }

    public void setEndYear(Date endYear) {
        this.endYear = endYear;
    }

    public String getTermDuration() {
        return termDuration;
    }

    public void setTermDuration(String termDuration) {
        this.termDuration = termDuration;
    }

    public String getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    public String getPartyLogoUrl() {
        return partyLogoUrl;
    }

    public void setPartyLogoUrl(String partyLogoUrl) {
        this.partyLogoUrl = partyLogoUrl;
    }

    public String getPartyShortHand() {
        return partyShortHand;
    }

    public void setPartyShortHand(String partyShortHand) {
        this.partyShortHand = partyShortHand;
    }

    public String getPositionHeld() {
        return positionHeld;
    }

    public void setPositionHeld(String positionHeld) {
        this.positionHeld = positionHeld;
    }

    public String getGeographicalArea() {
        return geographicalArea;
    }

    public void setGeographicalArea(String geographicalArea) {
        this.geographicalArea = geographicalArea;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }
}
