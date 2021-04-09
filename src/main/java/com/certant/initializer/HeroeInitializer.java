package com.certant.initializer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.certant.domain.Heroe;
import com.certant.service.HeroeService;

@Component
public class HeroeInitializer {
	
	@Autowired
	private HeroeService heroeService;

	
	@PostConstruct
	public void generateHero() {
		heroeService.add(new Heroe(1,"Aquaman","El poder más reconocido de Aquaman es la capacidad telepática para comunicarse con la vida marina, la cual puede convocar a grandes distancias.","assets/img/aquaman.png","1941-11-01","DC"));
		heroeService.add(new Heroe(2,"Batman","Los rasgos principales de Batman se resumen en «destreza física, habilidades deductivas y obsesión». La mayor parte de las características básicas de los cómics han variado por las diferentes interpretaciones que le han dado al personaje.","assets/img/batman.png","1939-05-01","DC"));
		heroeService.add(new Heroe(3,"DareDevil","Al haber perdido la vista, los cuatro sentidos restantes de Daredevil fueron aumentados por la radiación a niveles superhumanos, en el accidente que tuvo cuando era niño. A pesar de su ceguera, puede \"ver\" a través de un \"sexto sentido\" que le sirve como un radar similar al de los murciélagos.","assets/img/daredevil.png","1964-01-01","Marvel"));
		heroeService.add(new Heroe(4,"Hulk","Su principal poder es su capacidad de aumentar su fuerza hasta niveles prácticamente ilimitados a la vez que aumenta su furia. Dependiendo de qué personalidad de Hulk esté al mando en ese momento (el Hulk Banner es el más débil, pero lo compensa con su inteligencia).","assets/img/hulk.png","1962-05-01","Marvel"));
		heroeService.add(new Heroe(5,"Linterna Verde","Poseedor del anillo de poder que posee la capacidad de crear manifestaciones de luz sólida mediante la utilización del pensamiento. Es alimentado por la Llama Verde (revisada por escritores posteriores como un poder místico llamado Starheart), una llama mágica contenida en dentro de un orbe (el orbe era en realidad un meteorito verde de metal que cayó a la Tierra, el cual encontró un fabricante de lámparas llamado Chang)","assets/img/linterna-verde.png","1964-01-01","DC"));
	}
	
	
}
