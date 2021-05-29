package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.WorkCategory;
import com.cyrus.techsol.gov_track_ms.service.WorkCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_track_ms/api/v1")
public class WorkCategoryController {
    @Autowired
    private WorkCategoryService workCategoryService;

    @GetMapping("/getWorkCategoryById/{id}")
    private WorkCategory getWorkCategoryById(@PathVariable Integer id){
        return workCategoryService.getWorkCategoryById(id);
    }

    @GetMapping("/getAllWorkCategories")
    private List<WorkCategory> getAllWorkCategories(){
        return workCategoryService.getAllWorkCategories();
    }

    @PostMapping("/saveWorkCategory")
    private WorkCategory saveWorkCategory(@RequestBody WorkCategory workCategory){
        return workCategoryService.saveWorkCategory(workCategory);
    }

    @PostMapping("/saveWorkCategories")
    private List<WorkCategory> saveWorkCategories(@RequestBody List<WorkCategory> workCategoryList){
        return workCategoryService.saveWorkCategories(workCategoryList);
    }

    @PutMapping("/updateWorkCategory")
    private WorkCategory updateWorkCategory(@RequestBody WorkCategory workCategory){
        return workCategoryService.updateWorkCategory(workCategory);
    }

    @DeleteMapping("/deleteWorkCategoryById/{id}")
    private String deleteWorkCategoryById(@PathVariable Integer id){
        return workCategoryService.deleteWorkCategory(id);
    }
}
