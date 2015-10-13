package com.m2i.formation.dna;
import java.util.*;


public class DNA extends Strand{

	private List<DNABase> dnaBases = new ArrayList<DNABase>();
	
	//Constructor
	public DNA(){
		
	}

	//Getters and setters
	public List<DNABase> getDnaBases() {
		return dnaBases;
	}
	
}
