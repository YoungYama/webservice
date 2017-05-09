package com.yzz.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.yzz.webservice.MyService")
public class MyServiceImpl implements MyService {

	@Override
	public String sayHi(String name) {
		System.out.println("hello," + name);
		
		return name;
	}

}
