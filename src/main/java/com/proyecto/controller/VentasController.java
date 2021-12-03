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

import com.proyecto.models.VentasDTO;
import com.proyecto.repositores.IVentasDAO;

@RestController
@CrossOrigin(origins ="*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/ventas")
public class VentasController {
	@Autowired
	private IVentasDAO repository;

	@PostMapping("/ventas")
	public VentasDTO create(@Validated @RequestBody VentasDTO c) {
		return repository.insert(c);
	}

	@GetMapping("/")
	public List<VentasDTO> readAll(){
		return repository.findAll();
	}

	@GetMapping("/ventas/{id}")
	public Optional<VentasDTO> readId(@PathVariable String id){
		return repository.findById(id);
	}
	@PutMapping("/ventas/{id}")
	public VentasDTO update(@PathVariable String id, @Validated @RequestBody VentasDTO c) {
		return repository.save(c);
	}

	@DeleteMapping("/ventas/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}

}
