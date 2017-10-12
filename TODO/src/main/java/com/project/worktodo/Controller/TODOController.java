package com.project.worktodo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.worktodo.Model.TODO;
import com.project.worktodo.Service.TODOServiceImpl;


@RestController
@CrossOrigin
public class TODOController {
	
	private TODOServiceImpl todoServiceImpl;
	
	public TODOController(TODOServiceImpl todoServiceImpl) {
		this.todoServiceImpl = todoServiceImpl;
	}

	@GetMapping("/todos")
	public List<TODO> getTodos(@RequestParam(value = "user", required=false) String userName) {
		return todoServiceImpl.getTodosByUser(userName);
	}
	
	@PostMapping(value="/todos")
	public @ResponseBody TODO addTodo(@RequestBody TODO todo){
	    return todoServiceImpl.addTodo(todo);
	}
}
