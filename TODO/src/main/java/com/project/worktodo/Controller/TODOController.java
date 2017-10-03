package com.project.worktodo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOController {

	@CrossOrigin
	@GetMapping("/hello")
	public String hello(@RequestParam(required=false, defaultValue="World") String name) {
		return "Hello "+ name;
	}
}
