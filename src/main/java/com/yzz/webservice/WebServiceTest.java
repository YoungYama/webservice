package com.yzz.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class WebServiceTest {

	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		String url = "http://localhost:8888/webservice/services/testService?wsdl";

		Client client = dcf.createClient(url);
		
		Object[] response = client.invoke("sayHi", "param");
		for (Object obj : response) {
			System.out.println(obj);
		}
	}

}
