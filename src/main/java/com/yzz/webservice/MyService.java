package com.yzz.webservice;

import javax.jws.WebService;

@WebService
public interface MyService {
    public String sayHi(String name);
}
