package com.demo;

abstract class phone{
	abstract void draw();
}

class rec extends phone{
	void draw(){
		System.out.println("rectangle");
	}
}

class square extends phone{
	void draw(){
		System.out.println("square");
	}
}

public class check7 {
	
	public static void main(String[] args) {
		
		phone p = new square();
		p.draw();
	}

}
