package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto;
import com.cyrus.techsol.gov_track_ms.entities.WorkDone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkDoneRepository extends JpaRepository<WorkDone, Integer> {
    @Query(value = "SELECT * FROM WorkDone w ORDER BY w.dateCreated LIMIT 10", nativeQuery = true)
    List<WorkDone> getMostRecentWorkDone();

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto(w.id, w.title, w.description, w.progress," +
            "w.progressDescription, w.dateInitiated, w.dateWorkStarted, w.dateWorkCompleted, w.politicianId, w.termId, mt.mediaType, w.sourceLink, wc.workCategory)" +
            "FROM WorkDone w LEFT JOIN MediaType mt ON mt.id=w.sourceMediaType LEFT JOIN WorkCategory wc ON wc.id=w.workCategory")
    List<WorkDoneDto> getWorkDone();

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto(w.id, w.title, w.description, w.progress," +
            "w.progressDescription, w.dateInitiated, w.dateWorkStarted, w.dateWorkCompleted, w.politicianId, w.termId, mt.mediaType, w.sourceLink, wc.workCategory)" +
            "FROM WorkDone w LEFT JOIN MediaType mt ON mt.id=w.sourceMediaType LEFT JOIN WorkCategory wc ON wc.id=w.workCategory WHERE w.politicianId=?1")
    List<WorkDoneDto> getWorkDoneByPoliticianId(Integer politicianId);

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto(w.id, w.title, w.description, w.progress," +
            "w.progressDescription, w.dateInitiated, w.dateWorkStarted, w.dateWorkCompleted, w.politicianId, w.termId, mt.mediaType, w.sourceLink, wc.workCategory)" +
            "FROM WorkDone w LEFT JOIN MediaType mt ON mt.id=w.sourceMediaType LEFT JOIN WorkCategory wc ON wc.id=w.workCategory WHERE w.id=?1")
    WorkDoneDto getWorkDoneByWorkId(Integer workId);
}
