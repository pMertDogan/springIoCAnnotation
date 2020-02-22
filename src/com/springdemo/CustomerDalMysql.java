package com.springdemo;

import org.springframework.stereotype.Component;

public class CustomerDalMysql implements ICustomerDal {

	@Override
	public void add() {
			System.out.println("Mysql database e eklendi");
	}
	
}
