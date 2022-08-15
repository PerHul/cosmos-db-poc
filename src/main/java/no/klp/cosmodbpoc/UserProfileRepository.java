package no.klp.cosmodbpoc;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import no.klp.cosmodbpoc.model.UserProfile;

import reactor.core.publisher.Flux;

@Repository
public interface UserProfileRepository extends ReactiveCosmosRepository<UserProfile, String> {
    Flux<UserProfile> findByUserId(String userId);
}
