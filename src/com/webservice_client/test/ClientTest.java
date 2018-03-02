package com.webservice_client.test;

import com.webservice.ws.HelloWSImpl;
import com.webservice.ws.HelloWSImplService;

/**
 * µ÷ÓÃWebService
 * @author Administrator
 *
 */
public class ClientTest {
	public static void main(String[] args) {
		HelloWSImplService factory=new HelloWSImplService();
		HelloWSImpl helloWS=factory.getHelloWSImplPort();
		System.out.println(helloWS);
		
		String result=helloWS.sayHello("Jack");
		System.out.println("Client: "+result);
	}
}
