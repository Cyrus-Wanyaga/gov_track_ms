package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.entities.GeographicalArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeographicalAreaRepository extends JpaRepository<GeographicalArea, Integer> {
}
