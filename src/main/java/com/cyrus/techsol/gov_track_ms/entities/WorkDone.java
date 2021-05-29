package com.cyrus.techsol.gov_track_ms.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work_done")
public class WorkDone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "progress")
    private String progress;
    @Column(name = "progress_description")
    private String progressDescription;
    @Column(name = "date_initiated")
    private Date dateInitiated;
    @Column(name = "date_work_started")
    private Date dateWorkStarted;
    @Column(name = "date_work_completed")
    private Date dateWorkCompleted;
    @Column(name = "politician_id")
    private Integer politicianId;
    @Column(name = "term_id")
    private Integer termId;
    @Column(name = "source_media_type")
    private Integer sourceMediaType;
    @Column(name = "source_link")
    private String sourceLink;
    @Column(name = "work_category")
    private Integer workCategory;
//    @CreatedDate
//    @Column(name = "date_created")
//    private Date dateCreated;
//    @LastModifiedDate
//    @Column(name = "dateModified")
//    private Date dateModified;

    public WorkDone(){}

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

    public Integer getSourceMediaType() {
        return sourceMediaType;
    }

    public void setSourceMediaType(Integer sourceMediaType) {
        this.sourceMediaType = sourceMediaType;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public Integer getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(Integer workCategory) {
        this.workCategory = workCategory;
    }

//    public Date getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }
//
//    public Date getDateModified() {
//        return dateModified;
//    }
//
//    public void setDateModified(Date dateModified) {
//        this.dateModified = dateModified;
//    }
}
