package com.m2i.formation.dna;

import java.util.*;

public class Cell {
	private List<DNA> chromosomes = new ArrayList<DNA>();
	private List<RNA> rnas = new ArrayList<RNA>();
	private List<Protein> genome = new ArrayList<Protein>();
	
	
	
	//Constructor
	public Cell(){
		
	}
	
   //Other methods

	public void transcription(){
		
	}
    public void traduction(){
		
	}

    //Getters
	public List<DNA> getChromosomes() {
		return chromosomes;
	}

	public List<RNA> getRnas() {
		return rnas;
	}

	public List<Protein> getGenome() {
		return genome;
	}
	
	
}
