package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "county")
public class County {
    @Id
    @Column
    private Integer id;
    @Column(name = "county_name")
    private String countyName;
    @Column(name = "county_code")
    private Integer countyCode;

    public County() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }
}
