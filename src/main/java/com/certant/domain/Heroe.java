package com.certant.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Heroe {
	private int idx;
	private String nombre;
	private String bio;
	private String img;
	private String aparicion;
	private String casa;
}
