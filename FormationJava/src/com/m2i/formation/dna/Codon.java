package com.m2i.formation.dna;

public class Codon {

	private RNABase[] rnaBase = new RNABase[3];
	private AminoAcid aminoAcid;
	
	//Constructor
	public Codon(){
		
	}
	//Getters and setters

	public AminoAcid getAminoAcid() {
		return aminoAcid;
	}

	public RNABase[] getRnaBase() {
		return rnaBase;
	}

	public void setAminoAcid(AminoAcid aminoAcid) {
		this.aminoAcid = aminoAcid;
	}

	
	
}
