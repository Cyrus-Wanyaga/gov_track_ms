package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;

@Entity
@Table(name = "geographical_area")
public class GeographicalArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "geographical_area")
    private String geographicalArea;

    public GeographicalArea(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGeographicalArea() {
        return geographicalArea;
    }

    public void setGeographicalArea(String geographicalArea) {
        this.geographicalArea = geographicalArea;
    }
}
