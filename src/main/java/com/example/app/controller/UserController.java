package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public String listUser(){
		return "user naja";
		//return new ResponseEntity>(getUsers(), HttpStatus.OK);
	}

	@GetMapping("/user/{id}")
	public String listUser(@PathVariable(value = "id") String id){
		return "user id naja : " + id;
		//return new ResponseEntity(getUsers().stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null), HttpStatus.OK);

	}

	@PostMapping("/user")
	public String user(String str){
		return "post user naja";
		//return new ResponseEntity("18", HttpStatus.OK);
	}
}
