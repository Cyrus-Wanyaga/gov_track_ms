package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "politician")
public class Politician {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "county_affiliation")
    private Integer countyId;
    @Column(name = "current_position_held")
    private Integer currentLeadershipPosition;
    @Column(name = "active")
    private Integer active;
    @Column(name = "picture_url")
    private String pictureUrl;

    public Politician() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getCurrentLeadershipPosition() {
        return currentLeadershipPosition;
    }

    public void setCurrentLeadershipPosition(Integer currentLeadershipPosition) {
        this.currentLeadershipPosition = currentLeadershipPosition;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
