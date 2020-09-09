package com.githab.meraving.voter.service;

import com.githab.meraving.voter.dto.CreateVoteDto;
import com.githab.meraving.voter.dto.UpdateVoteDto;
import com.githab.meraving.voter.dto.VoteDto;

import java.time.LocalDate;
import java.util.List;

public interface VoteService {

    VoteDto create(CreateVoteDto createVoteDto);

    VoteDto get(Long id);

    VoteDto update(Long id, UpdateVoteDto updateVoteDto);

    void delete(Long id);

    List<VoteDto> getAllByMenu(Long id);

    VoteDto getByMenu_DateAndUser(LocalDate date, Long id);

    VoteDto castVote(Long Menuid);

}