package com.qa.testing;

public class Pizza {
	private int size;
	private boolean cheese;
	public boolean pepperoni;
	private boolean bacon;
	
	public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) {
		this.size = size;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.bacon = bacon;
	}
	
	
	
}
	
//	public class Builder {
//		private int size;
//		private boolean cheese;
//		private boolean pepperoni;
//		private boolean bacon;
//		
//		public Builder() { }
//		
//		public Builder setSize(int size) {
//			this.size = size;
//			return this;
//		}
//		
//		public Builder setCheese(boolean cheese) {
//			this.cheese = cheese;
//			return this;
//		}
//		
//		public Pizza build() {
//			return new Pizza(size, cheese, pepperoni, bacon);
//		}
//	
//}
	

