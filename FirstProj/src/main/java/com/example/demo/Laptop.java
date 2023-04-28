package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1") // we want object of Laptop class thats why we write @component. the lap1 is name of object in spring container this use when we use @Qulifier annotation
public class Laptop 
{
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compiler() 
	{
		System.out.println("Comppiling...");
	}
}
