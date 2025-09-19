package com.banusha.getset.assignment;

public class Person {
	 private String name;
	    private int age;

	    // Getter 
	    public String getName() {
	        return name;
	    }

	    // Setter 
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter 
	    public int getAge() {
	        return age;
	    }

	    // Setter 
	    public void setAge(int age) {
	        if(age > 0) {  
	            this.age = age;
	        } else {
	            System.out.println("Invalid age!!");
	        }
	    }
	}

