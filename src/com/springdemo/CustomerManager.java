package com.springdemo;

public class CustomerManager  implements ICustomerService{
	
	ICustomerDal customerDal;
	
	
	//Constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}
	


	public void add(){
		customerDal.add();
		
	}


}
