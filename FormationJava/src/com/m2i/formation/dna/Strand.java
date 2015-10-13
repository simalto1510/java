package com.m2i.formation.dna;

import java.util.*;

public class Strand {

	private List<Base> bases = new ArrayList<Base>();
	
	//Constructor
	public Strand(){
		
	}
	
	//Getters and setters
	public List<Base> getBases() {
		return bases;
	}
	public void setBases(List<Base> bases) {
		this.bases = bases;
	}
	
}
