package com.qa.testing;

public class Builder {
	private int size;
	private boolean cheese;
	private boolean pepperoni;
	private boolean bacon;
	
	public Builder() { }
	
	public Builder setSize(int size) {
		this.size = size;
		return this;
	}
	
	public Builder setCheese(boolean cheese) {
		this.cheese = cheese;
		return this;
	}
	public Builder setBacon(boolean bacon) {
		this.bacon = bacon;
		return this;
	}
	public Pizza build() {
		return new Pizza(size, cheese, pepperoni, bacon);
	}
}



