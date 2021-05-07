package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "terms_served")
public class TermsServed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "start_year")
    private Date startYear;
    @Column(name = "end_year")
    private Date endYear;
    @Column(name = "party_affiliation")
    private Integer partyAffiliation;
    @Column(name = "position_held")
    private Integer positionHeld;
    @Column(name = "geographical_area")
    private Integer geographicalArea;
    @Column(name = "politician_id")
    private Integer politicianId;
    @Column(name = "area_served")
    private String areaServed;

    public TermsServed(){}

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

    public Integer getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(Integer partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    public Integer getPositionHeld() {
        return positionHeld;
    }

    public void setPositionHeld(Integer positionHeld) {
        this.positionHeld = positionHeld;
    }

    public Integer getGeographicalArea() {
        return geographicalArea;
    }

    public void setGeographicalArea(Integer geographicalArea) {
        this.geographicalArea = geographicalArea;
    }

    public Integer getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(Integer politicianId) {
        this.politicianId = politicianId;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }
}
