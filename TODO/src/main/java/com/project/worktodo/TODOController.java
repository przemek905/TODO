package com.project.worktodo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOController {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/hello")
	public String hello(@RequestParam(required=false, defaultValue="World") String name) {
		return "Hello "+name;
	}
}
