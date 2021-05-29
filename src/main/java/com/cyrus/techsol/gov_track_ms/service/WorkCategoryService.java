package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.WorkCategory;
import com.cyrus.techsol.gov_track_ms.repository.WorkCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkCategoryService {
    @Autowired
    private WorkCategoryRepository workCategoryRepository;

    public WorkCategory getWorkCategoryById(Integer id){
        return workCategoryRepository.findById(id).get();
    }

    public List<WorkCategory> getAllWorkCategories(){
        return workCategoryRepository.getWorkCategories();
    }

    public WorkCategory saveWorkCategory(WorkCategory workCategory){
        return workCategoryRepository.save(workCategory);
    }

    public List<WorkCategory> saveWorkCategories(List<WorkCategory> workCategoryList){
        return workCategoryRepository.saveAll(workCategoryList);
    }

    public String deleteWorkCategory(Integer id){
        workCategoryRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public WorkCategory updateWorkCategory(WorkCategory workCategory){
        return workCategoryRepository.save(workCategory);
    }
}
