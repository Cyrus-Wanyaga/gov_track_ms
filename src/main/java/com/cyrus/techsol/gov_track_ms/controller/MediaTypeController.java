package com.cyrus.techsol.gov_track_ms.controller;

import com.cyrus.techsol.gov_track_ms.entities.MediaType;
import com.cyrus.techsol.gov_track_ms.service.MediaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gov_tracK_ms/api/v1")
public class MediaTypeController {
    @Autowired
    private MediaTypeService mediaTypeService;

    @GetMapping("/getMediaTypeById/{id}")
    private MediaType getMediaTypeById(@PathVariable Integer id){
        return mediaTypeService.getMediaTypeById(id);
    }

    @GetMapping("/getMediaTypes")
    private List<MediaType> getMediaTypes(){
        return mediaTypeService.getAllMediaTypes();
    }

    @PostMapping("/saveMediaType")
    private MediaType saveMediaType(@RequestBody MediaType mediaType){
        return mediaTypeService.saveMediaType(mediaType);
    }

    @PostMapping("/saveMediaTypes")
    private List<MediaType> saveMediaTypes(@RequestBody List<MediaType> mediaTypeList){
        return mediaTypeService.saveMediaTypes(mediaTypeList);
    }

    @PutMapping("/updateMediaTypes")
    private MediaType updateMediaType(@RequestBody MediaType mediaType){
        return mediaTypeService.updateMediaType(mediaType);
    }

    @DeleteMapping("/deleteMediaTypeById/{id}")
    private String deleteMediaTypeById(@PathVariable Integer id){
        return mediaTypeService.deleteMediaType(id);
    }
}
