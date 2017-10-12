package com.project.worktodo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.worktodo.Model.TODO;
import com.project.worktodo.Repository.TODORepository;

@Service
public class TODOServiceImpl {
	
	private TODORepository todoRepository;
	
	public TODOServiceImpl(TODORepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<TODO> getTodosByUser(String userName) {
		return todoRepository.findByUserName(userName);
	}
	
	public TODO addTodo(TODO todo) {
		return todoRepository.save(todo);
	}
	
}
