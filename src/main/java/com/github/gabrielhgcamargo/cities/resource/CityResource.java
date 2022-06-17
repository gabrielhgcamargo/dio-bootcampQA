package com.github.gabrielhgcamargo.cities.resource;

import com.github.gabrielhgcamargo.cities.entity.City;
import com.github.gabrielhgcamargo.cities.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private CityRepository cityRepository;

    public CityResource(final CityRepository repository) {
        this.cityRepository = repository;
    }

    @GetMapping
    public Page<City> cities(final Pageable page) {
        return cityRepository.findAll(page);
    }
}