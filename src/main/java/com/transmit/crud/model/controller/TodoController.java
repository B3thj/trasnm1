package com.transmit.crud.model.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transmit.crud.model.PersonasDTO;
import com.transmit.crud.model.repository.PersonasRepository;

@RestController
public class TodoController {

	@Autowired
	private PersonasRepository personasRepo;
	
	@GetMapping("/todos")
	public ResponseEntity <?> getAllTodos() {
		List<PersonasDTO> todos = personasRepo.findAll();
		if(todos.size() > 0) {
			return new ResponseEntity <List<PersonasDTO>> (todos, HttpStatus.OK);
		}else {
			return new ResponseEntity<>("No available dats ", HttpStatus.NOT_FOUND);
		}
	}
	
//	@PostMapping("/todos")
//	public ResponseEntity<?> createTodo(@RequestBody TodoDTO todo){
//		try {
////			todo.setCreatedAt(new Date(System.currentTimeMillis()));
//			todoRepo.save(todo);
//			return new ResponseEntity<TodoDTO>(todo, HttpStatus.OK);
//		} catch (Exception e) {
//			// TODO: handle exception
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
}
