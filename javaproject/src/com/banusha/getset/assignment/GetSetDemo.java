package com.banusha.getset.assignment;

public class GetSetDemo {
	    public static void main(String[] args) {
	        Person p1 = new Person();
	        p1.setName("Anusha");
	        p1.setAge(22);
	        System.out.println("Name: " + p1.getName());
	        System.out.println("Age: " + p1.getAge());
	        p1.setAge(-5);
	    }
	}

