package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.entities.LeadershipPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadershipPositionRepository extends JpaRepository<LeadershipPosition, Integer> {
}
