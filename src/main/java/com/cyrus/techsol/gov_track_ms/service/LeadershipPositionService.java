package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.LeadershipPosition;
import com.cyrus.techsol.gov_track_ms.repository.LeadershipPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadershipPositionService {
    @Autowired
    private LeadershipPositionRepository leadershipPositionRepository;

    public List<LeadershipPosition> getAllLeadershipPositions() {
        return leadershipPositionRepository.findAll();
    }

    public LeadershipPosition saveLeadershipPosition(LeadershipPosition leadershipPosition){
        return leadershipPositionRepository.save(leadershipPosition);
    }

    public String deleteLeadershipPosition(Integer id){
        leadershipPositionRepository.deleteById(id);
        return "Deleted successfully.";
    }
}
