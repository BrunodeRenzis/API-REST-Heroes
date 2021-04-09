package com.certant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.certant.domain.Heroe;
import com.certant.service.HeroeService;
import com.certant.views.BusquedaRequest;


@RestController
@CrossOrigin
public class AppController {

	@Autowired
	private HeroeService heroeService;
	
	@GetMapping("/heroes")
	public List<Heroe> listaHeroes(){
		return heroeService.getAll();
	}
	
	@PostMapping("/heroes/buscar")
	public List <Heroe> buscarHeroe(@RequestBody BusquedaRequest filtro) {
		return heroeService.getByNameOrDescription(filtro.getFiltro());
	}
	
	@PostMapping("/heroes/buscar-por-nombre")
	public List <Heroe> buscarHeroeByName(@RequestBody BusquedaRequest filtro) {
		return heroeService.getByName(filtro.getFiltro());
	}
	
	@PostMapping("/heroes/buscar-completo")
	public List <Heroe> buscarHeroeCompleto(@RequestBody BusquedaRequest filtro)
	{
		return heroeService.getByNameOrDescriptionOrDesignOrAparition(filtro.getFiltro());
	}
	
	@PostMapping("/heroes/guardar")
	 public Heroe addHeroe(@RequestBody Heroe heroe) {
        heroe.setIdx(heroe.getIdx());
        heroeService.add(heroe);
        return heroe;
    }
	
    @PutMapping("/heroes/actualizar")
    public Heroe updatePersona(@RequestBody Heroe persona) {

    	heroeService.add(persona);

        return persona;
    }
    
    @DeleteMapping("/heroes/{idx}")
    public String deleteHero(@PathVariable("idx") int heroId) {
        heroeService.deleteById(heroId);
        //Esto método, recibira el id de un usuario por URL y se borrará de la bd.
        return "Deleted hero id - "+heroId;
    }
	
}
