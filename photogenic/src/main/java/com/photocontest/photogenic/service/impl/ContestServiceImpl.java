package com.photocontest.photogenic.service.impl;

import com.photocontest.photogenic.model.request.CreateContestRequest;
import com.photocontest.photogenic.model.request.UpdateContestRequest;
import com.photocontest.photogenic.service.ContestService;
import com.photocontest.photogenic.service.dto.ContestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestServiceImpl implements ContestService {
    @Override
    public List<ContestDTO> getAllContests() {
        return null;
    }

    @Override
    public ContestDTO getContestById(Integer contestId) {
        return null;
    }

    @Override
    public ContestDTO addContest(CreateContestRequest request) {
        return null;
    }

    @Override
    public ContestDTO updateContest(Integer contestId, UpdateContestRequest request) {
        return null;
    }

    @Override
    public void removeContestById(Integer contestId) {

    }
}
