package com.banusha.abstraction.assignment;

public class Square extends Shapes {
	private int side=2;
	public Square(int side) {
		this.side=side;
	}
	void calArea() {
		super.area=side * side ;
	}
}
