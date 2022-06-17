package com.github.gabrielhgcamargo.countries.resource;

import com.github.gabrielhgcamargo.countries.entity.Country;
import com.github.gabrielhgcamargo.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository countryRepository;

    public CountryResource(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public Page<Country> countries(Pageable pageable){
        return countryRepository.findAll(pageable);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Country> optionalCountry = countryRepository.findById(id);

        if(optionalCountry.isPresent()){
            return ResponseEntity.ok().body(optionalCountry.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
