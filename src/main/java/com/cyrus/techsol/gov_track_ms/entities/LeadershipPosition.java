package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;

@Entity
@Table(name = "leadership_position")
public class LeadershipPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "position")
    private String position;

    public LeadershipPosition(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
