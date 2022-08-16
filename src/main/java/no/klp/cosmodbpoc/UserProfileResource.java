package no.klp.cosmodbpoc;

import org.springframework.web.bind.annotation.RestController;

import com.azure.cosmos.models.PartitionKey;

import no.klp.cosmodbpoc.model.UserProfile;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/userprofiles")
public class UserProfileResource {

	@Autowired
    private UserProfileRepository userProfileRepository;

    @GetMapping("{userId}")
	Mono<UserProfile> getUserProfile(@PathVariable("userId") String userId) {
		System.out.println("USERID:"+userId);
		return userProfileRepository.findById(userId);
	}

	@PostMapping("")
	Mono<UserProfile> addUserProfile(@RequestBody UserProfile userProfile) {
		System.out.println("USERID:"+userProfile.getId());
		return userProfileRepository.save(userProfile);
	}
}
