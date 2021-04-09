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
	
	public List <Heroe> getByName(String name) {
		return heroeRepository.getByName(name);
	}
	
	public List<Heroe> getByNameOrDescription(String filter){
		return heroeRepository.getByNameOrDescription(filter);
	}
	
	public List<Heroe> getByNameOrDescriptionOrDesignOrAparition(String filtro){
		return heroeRepository.getByNameOrDescriptionOrDesignOrAparition(filtro);
	}
	
	public void add(Heroe hero) {
		heroeRepository.add(hero);
	}	
}
