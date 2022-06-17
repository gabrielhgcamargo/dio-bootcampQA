package com.github.gabrielhgcamargo.staties.resource;

import com.github.gabrielhgcamargo.staties.entity.State;
import com.github.gabrielhgcamargo.staties.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository stateRepository;

    public StateResource(final StateRepository repository) {
        this.stateRepository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return stateRepository.findAll();
    }
}