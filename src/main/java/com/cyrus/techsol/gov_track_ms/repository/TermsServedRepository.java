package com.cyrus.techsol.gov_track_ms.repository;

import com.cyrus.techsol.gov_track_ms.dto.PoliticianByPartyDto;
import com.cyrus.techsol.gov_track_ms.dto.TermsServedDto;
import com.cyrus.techsol.gov_track_ms.entities.TermsServed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TermsServedRepository extends JpaRepository<TermsServed, Integer> {
    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.TermsServedDto(t.id, t.startYear, t.endYear, pa.partyName," +
            "pa.partyLogoUrl, pa.partyShortHand, l.position, g.geographicalArea, t.areaServed) " +
            "FROM TermsServed t INNER JOIN Politician p on t.politicianId = p.id INNER JOIN GeographicalArea g " +
            "ON t.geographicalArea=g.id INNER JOIN Party pa ON t.partyAffiliation=pa.id INNER JOIN LeadershipPosition l " +
            "ON t.positionHeld=l.id WHERE t.politicianId = ?1 ORDER BY t.startYear")
    List<TermsServedDto> getTermsByPoliticianId(Integer id);

    @Query(value = "SELECT new com.cyrus.techsol.gov_track_ms.dto.PoliticianByPartyDto(pa.partyName, pa.partyShortHand, pa.partyLogoUrl, t.politicianId) " +
            "FROM TermsServed t INNER JOIN Party pa ON t.partyAffiliation=pa.id WHERE pa.partyName=?1 GROUP BY t.politicianId")
    List<PoliticianByPartyDto> getPoliticiansByParty(String partyName);
}
