package com.prowings.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	
	@Column
 	int weight;
	@Column
	double height;
	
	
	public Person() {
		super();
 	}


	public Person(int weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}
	
	
	
}
