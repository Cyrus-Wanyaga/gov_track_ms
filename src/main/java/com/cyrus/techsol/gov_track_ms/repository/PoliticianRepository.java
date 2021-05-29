package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto;
import com.cyrus.techsol.gov_track_ms.dto.TopPositionsPoliticiansDto;
import com.cyrus.techsol.gov_track_ms.entities.Politician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliticianRepository extends JpaRepository<Politician, Integer> {
    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto(p.id, p.firstName, p.middleName, p.lastName, p.gender, l.position, " +
            "p.dateOfBirth, p.pictureUrl, p.active, c.countyName, c.countyCode)" +
            "FROM Politician p LEFT JOIN County c ON p.countyId=c.id LEFT JOIN LeadershipPosition l ON l.id = p.currentLeadershipPosition WHERE p.id = ?1")
    PoliticianCountyDto getPoliticianById(Integer id);

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto(p.id, p.firstName, p.middleName, p.lastName, p.gender, l.position, " +
            "p.dateOfBirth, p.pictureUrl, p.active, c.countyName, c.countyCode)" +
            "FROM Politician p LEFT JOIN County c ON p.countyId=c.id LEFT JOIN LeadershipPosition l ON l.id = p.currentLeadershipPosition")
    List<PoliticianCountyDto> getAllPoliticians();

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.TopPositionsPoliticiansDto(p.id, p.firstName, p.middleName, p.lastName, p.gender, l.position, " +
            "p.dateOfBirth, p.pictureUrl, p.active, c.countyName, c.countyCode)" +
            "FROM Politician p INNER JOIN County c ON p.countyId=c.id INNER JOIN LeadershipPosition l ON l.id = p.currentLeadershipPosition " +
            "WHERE l.position='President' OR l.position='Vice President' OR l.position='Senator'")
    List<TopPositionsPoliticiansDto> getTopPositions();

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto(p.id, p.firstName, p.middleName, p.lastName, p.gender, l.position, " +
            "p.dateOfBirth, p.pictureUrl, p.active, c.countyName, c.countyCode)" +
            "FROM Politician p LEFT JOIN County c ON p.countyId=c.id LEFT JOIN LeadershipPosition l ON l.id = p.currentLeadershipPosition WHERE c.countyName=?1")
    List<PoliticianCountyDto> getPoliticianByCounty(String countyName);

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.PoliticianCountyDto(p.id, p.firstName, p.middleName, p.lastName, p.gender, l.position, " +
            "p.dateOfBirth, p.pictureUrl, p.active, c.countyName, c.countyCode)" +
            "FROM Politician p INNER JOIN County c ON p.countyId=c.id INNER JOIN LeadershipPosition l ON l.id = p.currentLeadershipPosition WHERE l.position=?1")
    List<PoliticianCountyDto> getPoliticianByLeadershipPosition(String leadershipPosition);
}
