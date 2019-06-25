package com.xworkz.di.component;

public class Application {
	private String appName;

	Application() {
		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {

		System.out.println("appclass setter going to invoked::" + appName);
		this.appName = appName;
	}

}
