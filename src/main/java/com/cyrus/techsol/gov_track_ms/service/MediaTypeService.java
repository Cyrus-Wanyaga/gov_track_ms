package com.cyrus.techsol.gov_track_ms.service;

import com.cyrus.techsol.gov_track_ms.entities.MediaType;
import com.cyrus.techsol.gov_track_ms.repository.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaTypeService {
    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    public MediaType getMediaTypeById(Integer id){
        return mediaTypeRepository.findById(id).get();
    }

    public List<MediaType> getAllMediaTypes(){
        return mediaTypeRepository.findAll();
    }

    public MediaType saveMediaType(MediaType mediaType){
        return mediaTypeRepository.save(mediaType);
    }

    public List<MediaType> saveMediaTypes(List<MediaType> mediaTypeList){
        return mediaTypeRepository.saveAll(mediaTypeList);
    }

    public String deleteMediaType(Integer id){
        mediaTypeRepository.deleteById(id);
        return "Deleted successfully.";
    }

    public MediaType updateMediaType(MediaType mediaType){
        return mediaTypeRepository.save(mediaType);
    }
}
