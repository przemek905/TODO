package com.project.worktodo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TODORepository extends PagingAndSortingRepository<TODO, Long> {
	
	List<TODO> findByText(@Param("text") String name);

}