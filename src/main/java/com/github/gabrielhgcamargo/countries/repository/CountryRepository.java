package com.github.gabrielhgcamargo.countries.repository;

import com.github.gabrielhgcamargo.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
