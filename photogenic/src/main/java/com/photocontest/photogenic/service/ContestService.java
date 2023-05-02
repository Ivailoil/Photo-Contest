package com.photocontest.photogenic.service;

import com.photocontest.photogenic.model.request.CreateContestRequest;
import com.photocontest.photogenic.model.request.UpdateContestRequest;
import com.photocontest.photogenic.service.dto.ContestDTO;

import java.util.List;

public interface ContestService {

    List<ContestDTO> getAllContests();

    ContestDTO getContestById(Integer contestId);

    ContestDTO addContest(CreateContestRequest request);

    ContestDTO updateContest(Integer contestId, UpdateContestRequest request);

    void removeContestById(Integer contestId);
}
