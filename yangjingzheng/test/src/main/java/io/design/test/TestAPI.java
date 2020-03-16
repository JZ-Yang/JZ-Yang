package io.design.test;

import com.github.tools.generators.docs.APIDocGenerator;

import test.test.services.UserService;

public class TestAPI {
	
	public static void main( String[] args ) throws Exception
    {
		APIDocGenerator apig = new APIDocGenerator();
		//对应application.yml
		apig.createAPIDoc("http://127.0.0.1:12345", UserService.class);
		apig.write();
    }
}