package com.raphael.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
		
		@GetMapping
		public ResponseEntity< List<User>> findAll(){
			
			User maria =new User("1", "maria da silva", "maria@gmail.com");
			User alex = new User("2", "alex kid", "alexalex@gmail.com");
			List<User> List = new ArrayList<>();
			List.addAll(Arrays.asList(maria,alex));
			return ResponseEntity.ok().body(List);
		}
		
	

}
