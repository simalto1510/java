package com.m2i.formation.dna;

import java.util.*;

public class RNA extends Strand{

	private List<RNABase> rnaBases = new ArrayList<RNABase>();

	//Constructor
	public RNA(){
		
	}

	//Getters and setters
	public List<RNABase> getRnaBases() {
		return rnaBases;
	}

}
