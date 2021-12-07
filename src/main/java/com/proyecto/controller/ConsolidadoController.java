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

import com.proyecto.models.ConsolidadoDTO;
import com.proyecto.repositores.IConsolidadoDAO;

@RestController
@CrossOrigin(origins ="*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/consolidado")
public class ConsolidadoController {
	@Autowired
	private IConsolidadoDAO repository;

	@PostMapping("/consolidado")
	public ConsolidadoDTO create(@Validated @RequestBody ConsolidadoDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<ConsolidadoDTO> readAll(){
		return repository.findAll();
	}

	@GetMapping("/consolidado/{id}")
	public Optional<ConsolidadoDTO> readId(@PathVariable String id){
		return repository.findById(id);
	}
	@PutMapping("/consolidado/{id}")
	public ConsolidadoDTO update(@PathVariable String id, @Validated @RequestBody ConsolidadoDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/consolidado/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}	

}
