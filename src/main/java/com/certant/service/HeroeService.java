package com.certant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certant.domain.Heroe;
import com.certant.repository.HeroeRepository;

@Service
public class HeroeService {
	
	@Autowired
	private HeroeRepository heroeRepository;
	
	public List<Heroe> getAll(){
		return heroeRepository.getAll();
	}
	
	public Heroe getByName(String name) throws Exception {
		Optional <Heroe> hero = heroeRepository.getByName(name);
		if(hero.isPresent()){
			return hero.get();			
		} else {
			throw new Exception ("No se encontró el heroe");
		}
	}
	
	public void add(Heroe hero) {
		heroeRepository.add(hero);
	}	
}
