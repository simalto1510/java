package com.m2i.formation.dna;

public class AminoAcid {

	private String longName;
	private String trigram;
	private char code;
	
//Methods of this class
	//Constructor
	protected AminoAcid(){
		
	}
	public AminoAcid factory(String code){
		AminoAcid aminoAcid = new AminoAcid();
		
		return aminoAcid;
	}
	//Getters and Setters
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getTrigram() {
		return trigram;
	}
	public void setTrigram(String trigram) {
		this.trigram = trigram;
	}
	public char getCode() {
		return code;
	}
	public void setCode(char code) {
		this.code = code;
	}
}
