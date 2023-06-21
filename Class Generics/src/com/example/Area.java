package com.example;

public class Area<T> {
	
	public T sizeOfSide;
	
	public void intputsize(T x) {
		this.sizeOfSide=x;
	}
	
	public T getArea() {
		//cannot perform multiplication of sides cause who knows T can be inputed as a string so error
		return sizeOfSide;
	}
	public static void main(String[] args) {
		Area area = new Area();
		area.intputsize(2);
		System.out.println(area.getArea());
		area.intputsize(2.5);
		System.out.println(area.getArea());
		area.intputsize("twenty three");
		System.out.println(area.getArea());
	}
	

}
