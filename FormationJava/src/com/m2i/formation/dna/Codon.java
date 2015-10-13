package com.m2i.formation.dna;

public class Codon {

	RNABase[] rnaBase = new RNABase[3];
	
	//Constructor
	public Codon(){
		
	}
	//Getters and setters

	public RNABase[] getRnaBase() {
		return rnaBase;
	}

	public void setRnaBase(RNABase[] rnaBase) {
		this.rnaBase = rnaBase;
	}
	
}
