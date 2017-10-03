package com.project.worktodo.Repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.worktodo.Model.TODO;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TODORepository extends PagingAndSortingRepository<TODO, Long> {
	
	List<TODO> findByTitle(@Param("title") String name);

}