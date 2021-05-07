package com.cyrus.techsol.gov_track_ms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class PoliticianCountyDto {
    private Integer politicianId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String age;
    private String currentPosition;
    private Date dateOfBirth;
    private String pictureUrl;
    private Integer active;
    private String county;
    private Integer countyCode;

    public PoliticianCountyDto(Integer politicianId, String firstName, String middleName, String lastName,
                               String gender, String currentPosition, Date dateOfBirth, String pictureUrl,
                               Integer active, String county, Integer countyCode) {
        this.politicianId = politicianId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.currentPosition = currentPosition;
        this.dateOfBirth = dateOfBirth;
        this.pictureUrl = pictureUrl;
        this.active = active;
        this.county = county;
        this.countyCode = countyCode;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(Integer politicianId) {
        this.politicianId = politicianId;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PoliticianCountyDto{" +
                "politicianId=" + politicianId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", currentPosition='" + currentPosition + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", county='" + county + '\'' +
                ", countyCode=" + countyCode +
                '}';
    }
}
