package com.cyrus.techsol.gov_track_ms.entities;

import javax.persistence.*;

@Entity
@Table(name = "party")
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "party_name")
    private String partyName;
    @Column(name = "party_shorthand")
    private String partyShortHand;
    @Column(name = "party_logo_url")
    private String partyLogoUrl;

    public Party(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
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
}
