package no.klp.cosmodbpoc;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import no.klp.cosmodbpoc.model.UserProfile;

@Repository
public interface UserProfileRepository extends ReactiveCosmosRepository<UserProfile, String> {
    
}
