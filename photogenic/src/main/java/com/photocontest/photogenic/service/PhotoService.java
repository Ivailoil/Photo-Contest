package com.photocontest.photogenic.service;

import com.photocontest.photogenic.service.dto.PhotoDTO;

import java.util.List;

public interface PhotoService {
    List<PhotoDTO> getAllPhotos();

    PhotoDTO getPhotoById(Integer photoId);

    void removePhotoById(Integer photoId);
}
