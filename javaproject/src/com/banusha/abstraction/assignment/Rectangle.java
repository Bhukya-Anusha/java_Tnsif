package com.banusha.abstraction.assignment;

public class Rectangle extends Shapes{
	private int l =3, b=5;
	public Rectangle(int l, int b) {
		this.l=l;
		this.b=b;
	}
	void calArea() {
		super.area=l*b;
	}
}
