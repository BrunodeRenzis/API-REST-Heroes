package com.certant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certant.domain.Heroe;
import com.certant.service.HeroeService;


@RestController
@CrossOrigin
public class AppController {

	@Autowired
	private HeroeService heroeService;
	
	@GetMapping("/heroes")
	public List<Heroe> listaHeroes(){
		return heroeService.getAll();
	}
	
	@PostMapping("/heroes/buscar/{nombre}")
	public Heroe buscarHeroe(@PathVariable("nombre") String nombre) {
		return new Heroe();
	}
}
