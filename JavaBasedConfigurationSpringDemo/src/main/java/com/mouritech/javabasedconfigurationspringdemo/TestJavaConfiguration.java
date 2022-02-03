package com.mouritech.javabasedconfigurationspringdemo;

public class TestJavaConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfiguration.class);
       PrimeCustomer pservice=(PrimeCustomer) appContext.getBean("pService");
	}

}
