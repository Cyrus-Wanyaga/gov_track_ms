package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;

@Entity
@Table(name = "work_category")
public class WorkCategory {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "work_category")
    private String workCategory;
    @Column(name = "description")
    private String description;

    public WorkCategory() {
    }

    public WorkCategory(Integer id, String workCategory, String description) {
        this.id = id;
        this.workCategory = workCategory;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
