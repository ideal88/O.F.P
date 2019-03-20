package um.ofp.ofp.services;

import org.springframework.stereotype.Service;
import um.ofp.ofp.models.Country;
import um.ofp.ofp.repositories.CountryRepository;

@Service
public class CountryServiceImplimentation implements CountryService {
  CountryRepository countryRepository;

    public CountryServiceImplimentation(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Iterable<Country> getAllCounries() {
        return countryRepository.findAll();
    }
}
