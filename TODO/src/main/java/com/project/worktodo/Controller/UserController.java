package com.project.worktodo.Controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.worktodo.Model.ApplicationUser;
import com.project.worktodo.Repository.ApplicationUserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(ApplicationUserRepository applicationUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public ApplicationUser signUp(@RequestBody ApplicationUser user) {
    	ApplicationUser alreadyExistingUser = applicationUserRepository.findByUsername(user.getUsername());
    	
    	if (!userExists(alreadyExistingUser)) {
    		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    		applicationUserRepository.save(user);
    		return user;
    	} 
    	else {
    		return new ApplicationUser();
    	}
    }

	private boolean userExists(ApplicationUser alreadyExistingUser) {
		return alreadyExistingUser != null;
	}
}
