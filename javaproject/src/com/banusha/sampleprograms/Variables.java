package com.banusha.sampleprograms;

public class Variables {
	
	public void localVariable() {
		
		int b =50;
		System.out.println(b);
		}
	public static void main(String[] args) {
		int a=30;
		Variables obj = new Variables();
		System.out.println(a);
		obj.localVariable();

	}

}