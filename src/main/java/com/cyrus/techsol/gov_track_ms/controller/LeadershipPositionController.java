package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.LeadershipPosition;
import com.cyrus.techsol.gov_track_ms.service.LeadershipPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class LeadershipPositionController {
    @Autowired
    private LeadershipPositionService leadershipPositionService;

    @GetMapping("/getAllLeadershipPositions")
    private List<LeadershipPosition> getAllLeadershipPositions() {
        return leadershipPositionService.getAllLeadershipPositions();
    }

    @PostMapping("/saveLeadershipPosition")
    private LeadershipPosition saveLeadershipPosition(@RequestBody LeadershipPosition leadershipPosition){
        return leadershipPositionService.saveLeadershipPosition(leadershipPosition);
    }

    @DeleteMapping("/deleteLeadershipPosition/{id}")
    private String deleteLeadershipPosition(@PathVariable Integer id){
        return leadershipPositionService.deleteLeadershipPosition(id);
    }
}
