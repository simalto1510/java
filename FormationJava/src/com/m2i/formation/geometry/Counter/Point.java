package com.m2i.formation.geometry.Counter;

public class Point {
	public int x;
	public int y;
	
	public void afficher(){
		System.out.println("("+x+";"+y+")");
		}
	public void deplacer(int newx, int newy){
		x = newx;
		y = newy;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
