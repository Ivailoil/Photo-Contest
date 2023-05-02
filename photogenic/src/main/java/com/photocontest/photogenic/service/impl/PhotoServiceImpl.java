package com.photocontest.photogenic.service.impl;

import com.photocontest.photogenic.service.PhotoService;
import com.photocontest.photogenic.service.dto.PhotoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {
    @Override
    public List<PhotoDTO> getAllPhotos() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public PhotoDTO getPhotoById(Integer photoId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void removePhotoById(Integer photoId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
