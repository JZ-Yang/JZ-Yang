package io.design.test;

import com.github.tools.generators.codes.ServiceGenerator;

import test.test.mappers.UserMapper;

public class Test {
	
	public static void main( String[] args ) throws Exception
    {
		ServiceGenerator sg = new ServiceGenerator();
		sg.createServiceFromMapper(UserMapper.class);
		sg.write();
    }
}