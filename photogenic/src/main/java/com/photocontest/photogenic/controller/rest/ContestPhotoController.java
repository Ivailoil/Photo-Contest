package com.photocontest.photogenic.controller.rest;

import com.photocontest.photogenic.service.dto.PhotoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/contests")
public class ContestPhotoController {

    @GetMapping("/{contestId/photos")
    public ResponseEntity<Set<PhotoDTO>> getAllContestPhotos() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/{contestId}/photos")
    public ResponseEntity<PhotoDTO> submitPhoto(@PathVariable Integer contestId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/{contestId}/photos/{photoId}")
    public ResponseEntity<PhotoDTO> ratePhoto(@PathVariable Integer contestId,
                                              @PathVariable Integer photoId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
