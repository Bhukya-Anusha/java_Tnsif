package com.banusha.inface.assignment;

public class InterfaceDemo {
	public static void main(String[] args) {
		Jio j=new Jio();
		j.calls();
		j.sms();
		System.out.println("---------------------------");
		Samsung s= new Samsung();
		s.calls();
		s.sms();
	}
}
