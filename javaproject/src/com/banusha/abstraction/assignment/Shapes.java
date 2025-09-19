package com.banusha.abstraction.assignment;

abstract class Shapes {
	protected float area;
	
	abstract void calArea();
	
	public void show() {
		System.out.println("The Area of the Shape is :" +area);
	}

}
