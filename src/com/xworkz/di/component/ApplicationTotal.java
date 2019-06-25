package com.xworkz.di.component;

public class ApplicationTotal {
	private String name;
	private int version;
	private String type;
	private boolean active;

	ApplicationTotal() 
	{
		
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
