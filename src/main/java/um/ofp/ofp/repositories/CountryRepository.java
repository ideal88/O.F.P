package um.ofp.ofp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import um.ofp.ofp.models.Country;

import java.util.Optional;

@Service
public interface CountryRepository extends CrudRepository<Country,String> {
    Country findByCountryID(String id);
}
