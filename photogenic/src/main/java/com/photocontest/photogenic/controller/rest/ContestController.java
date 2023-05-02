package com.photocontest.photogenic.controller.rest;

import com.photocontest.photogenic.model.request.CreateContestRequest;
import com.photocontest.photogenic.model.request.UpdateContestRequest;
import com.photocontest.photogenic.service.ContestService;
import com.photocontest.photogenic.service.dto.ContestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contests")
public class ContestController {

    public static final String CONTEST_DELETED = "Contest was deleted";
    private final ContestService contestService;

    @Autowired
    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @GetMapping
    public ResponseEntity<List<ContestDTO>> getAllContests() {
        List<ContestDTO> contestDTOList = contestService.getAllContests();
        return new ResponseEntity<>(contestDTOList, HttpStatus.OK);
    }

    @GetMapping("/{contestId}")
    public ResponseEntity<ContestDTO> getContest(@PathVariable Integer contestId) {
        ContestDTO contestDTO = contestService.getContestById(contestId);
        return new ResponseEntity<>(contestDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ContestDTO> createContest(@RequestBody CreateContestRequest request) {
        ContestDTO newContest = contestService.addContest(request);
        return new ResponseEntity<>(newContest, HttpStatus.CREATED);
    }

    @PutMapping("/{contestId}")
    public ResponseEntity<ContestDTO> updateContest(@PathVariable Integer contestId,
                                                    @RequestBody UpdateContestRequest request) {
        ContestDTO updateContest = contestService.updateContest(contestId, request);
        return new ResponseEntity<>(updateContest, HttpStatus.OK);
    }

    @DeleteMapping("/{contestId}")
    public ResponseEntity<String> deleteContest(@PathVariable Integer contestId) {
        contestService.removeContestById(contestId);
        return new ResponseEntity<>(CONTEST_DELETED, HttpStatus.OK);
    }
}
