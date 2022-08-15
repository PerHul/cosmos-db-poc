package no.klp.cosmodbpoc;

import org.springframework.web.bind.annotation.RestController;

import no.klp.cosmodbpoc.model.UserProfile;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping("/userprofiles")
public class UserProfileResource {

	@Autowired
    private UserProfileRepository userProfileRepository;

    @GetMapping("/{userId}")
	Mono<UserProfile> getUserProfile(@RequestParam("userId") String userId) {
		return userProfileRepository.findById(userId);
	}

	@PostMapping("/")
	Mono<UserProfile> addUserProfile(UserProfile userProfile) {
		return userProfileRepository.save(userProfile);
	}
}
