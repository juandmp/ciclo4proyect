package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.proyecto.models.ProveedoresDTO;
import com.proyecto.repositores.IProveedoresDAO;

@RestController
@CrossOrigin(origins ="*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/proveedores")
public class ProveedoresController {
	@Autowired
	private IProveedoresDAO repository;

	@PostMapping("/proveedores")
	public ProveedoresDTO create(@Validated @RequestBody ProveedoresDTO c) {
		return repository.insert(c);
	}

	@GetMapping("/")
	public List<ProveedoresDTO> readAll(){
		return repository.findAll();
	}

	@GetMapping("/proveedores/{id}")
	public Optional<ProveedoresDTO> readId(@PathVariable String id){
		return repository.findById(id);
	}
	@PutMapping("/proveedores/{id}")
	public ProveedoresDTO update(@PathVariable String id, @Validated @RequestBody ProveedoresDTO c) {
		return repository.save(c);
	}

	@DeleteMapping("/proveedores/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}

}
