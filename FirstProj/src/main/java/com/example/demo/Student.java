package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope; if you use @Scop annotation then you can uncomment it
import org.springframework.stereotype.Component;

@Component // by default spring use singleton concept so it only create one object in spring container and provide same object whenever required for this class.
//@Scope(value="prototype") it create every time new object whenever you ask for new object for this class. it only create object when we use getBean method till now it even create object in spring container 
public class Student {
	
	private int aid;
	private String aname;
	private String tech;
	@Autowired // now this Student class is depended on Laptop class object, object of laptop is created in spring container but by using @Autowire annotation we join this Alien and Laptop class object to each other in spring container
	@Qualifier("lap1") // by default Autowire search object by type, but if you want to search object by name in spring container then we use @Qulifier annotation
	private Laptop laptop;
	
	
	public Alien() {
		super();
		System.out.println("Object created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show()
	{
		System.out.println("In show");
		laptop.compiler();
	}

}
