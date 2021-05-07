package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Integer> {
}
