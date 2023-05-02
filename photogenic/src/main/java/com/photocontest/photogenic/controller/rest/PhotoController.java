package com.photocontest.photogenic.controller.rest;

import com.photocontest.photogenic.service.PhotoService;
import com.photocontest.photogenic.service.dto.PhotoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/photos")
public class PhotoController {
    public static final String PHOTO_DELETED = "Photo was deleted";

    private final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping
    public ResponseEntity<List<PhotoDTO>> getAllPhotos() {
        List<PhotoDTO> photoDTOList = photoService.getAllPhotos();
        return new ResponseEntity<>(photoDTOList, HttpStatus.OK);
    }

    @GetMapping("/{photoId}")
    public ResponseEntity<PhotoDTO> getPhoto(@PathVariable Integer photoId) {
        PhotoDTO photoDTO = photoService.getPhotoById(photoId);
        return new ResponseEntity<>(photoDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{photoId}")
    public ResponseEntity<String> deletePhoto(@PathVariable Integer photoId) {
        photoService.removePhotoById(photoId);
        return new ResponseEntity<>(PHOTO_DELETED, HttpStatus.OK);
    }
}
