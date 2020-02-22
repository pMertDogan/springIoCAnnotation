package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class CustomerDalMsSql implements ICustomerDal {
	
@Value("${deneme.name}")
String deger;

	@Override
	public void add() {
		System.out.println("Ms SQL database e eklendi");
		System.out.println(deger);

	}

}
