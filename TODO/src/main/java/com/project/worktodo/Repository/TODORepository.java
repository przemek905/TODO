package com.project.worktodo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.worktodo.Model.TODO;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TODORepository extends JpaRepository<TODO, Long> {
	
	List<TODO> findByUserName(String userName);

}