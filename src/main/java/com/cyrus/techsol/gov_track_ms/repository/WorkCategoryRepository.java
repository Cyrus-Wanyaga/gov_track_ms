package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.entities.WorkCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface WorkCategoryRepository extends JpaRepository<WorkCategory, Integer> {
    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.entities.WorkCategory(wc.id, wc.workCategory, wc.description) FROM WorkCategory wc")
    List<WorkCategory> getWorkCategories();
}
