package com.project.worktodo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.worktodo.Model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
