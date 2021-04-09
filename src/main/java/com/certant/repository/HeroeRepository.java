package com.certant.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.certant.domain.Heroe;

@Repository
public class HeroeRepository {
	private List<Heroe> heroes = new ArrayList<Heroe>();
	
	public void add(Heroe hero){
		heroes.add(hero);
	}
	
	public List<Heroe> getAll(){
		return this.heroes;
	}
	
	public Optional<Heroe> getByName(String name) {
		return heroes.stream().filter(heroe -> heroe.getNombre().equalsIgnoreCase(name)).findFirst(); //stream permite usar expresiones lambda e iterar en las colecciones
	}
}
