package com.certant.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.certant.domain.Heroe;

@Repository
public class HeroeRepository {
	private List<Heroe> heroes = new ArrayList<Heroe>();
	
	public void add(Heroe hero){
		heroes.add(hero);
	}
	
	public Optional <Heroe> findById(int id) {
		return heroes.stream()
			   .filter(heroe-> heroe.getIdx() == id)
			   .findFirst();
	}
	
	public void delete(Heroe heroe) {
		heroes.remove(heroe);
	}
	
	public List<Heroe> getAll(){
		return this.heroes;
	}
	
	public List<Heroe> getByName(String name) {
		return heroes.stream()
				.filter(heroe -> heroe.getNombre().toLowerCase().contains(name.toLowerCase()))
				.collect(Collectors.toList()); //stream permite usar expresiones lambda e iterar en las colecciones
	}
	
	public List<Heroe> getByNameOrDescription(String filtro){
		return heroes.stream()
				.filter(heroe -> {
					return heroe.getNombre().toLowerCase().contains(filtro.toLowerCase())
					|| heroe.getBio().toLowerCase().contains(filtro.toLowerCase());
				})
				.collect(Collectors.toList());
	}
	
	public List<Heroe> getByNameOrDescriptionOrDesignOrAparition(String filtro){
		return heroes.stream()
				.filter(heroe -> {
					return heroe.getNombre().toLowerCase().contains(filtro.toLowerCase())
					|| heroe.getBio().toLowerCase().contains(filtro.toLowerCase())
					|| heroe.getCasa().toLowerCase().contains(filtro.toLowerCase())
					|| heroe.getAparicion().contains(filtro);
				})
				.collect(Collectors.toList());
	}
	
	
}
