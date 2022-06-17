package com.github.gabrielhgcamargo.staties.repository;

import com.github.gabrielhgcamargo.staties.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
