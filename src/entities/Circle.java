package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private Double radios;
	
	

	public Circle() {
		
	}
	
	public Circle(Color color, Double radios) {
		super(color);
		this.radios = radios;
	}
	
	

	public Double getRadios() {
		return radios;
	}

	public void setRadios(Double radios) {
		this.radios = radios;
	}

	@Override
	public Double area() {
		
		double area= Math.PI * getRadios() * getRadios();
		
		
		return area;
	}
	

}
