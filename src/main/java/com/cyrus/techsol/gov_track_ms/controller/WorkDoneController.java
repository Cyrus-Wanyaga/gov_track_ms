package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.dto.WorkDoneDto;
import com.cyrus.techsol.gov_track_ms.entities.WorkDone;
import com.cyrus.techsol.gov_track_ms.service.WorkDoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class WorkDoneController {
    @Autowired
    private WorkDoneService workDoneService;

    @GetMapping("/getWorkDone")
    private List<WorkDoneDto> getWorkDone(){
        return workDoneService.getWorkDone();
    }

    @GetMapping("/getWorkDoneByWorkId/{workId}")
    private WorkDoneDto getWorkDoneByWorkId(@PathVariable Integer workId){
        return workDoneService.getWorkDoneByWorkId(workId);
    }

    @GetMapping("/getWorkDoneByPoliticianId/{politicianId}")
    private List<WorkDoneDto> getWorkDoneByPoliticianId(@PathVariable Integer politicianId){
        return workDoneService.getWorkDoneByPoliticianId(politicianId);
    }

    @PostMapping("/saveWorkDone")
    private WorkDone saveWorkDone(@RequestBody WorkDone workDone){
        return workDoneService.saveWorkDone(workDone);
    }
}
