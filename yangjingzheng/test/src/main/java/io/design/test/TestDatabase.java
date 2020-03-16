package io.design.test;

import com.github.tools.generators.docs.SqlDocGenerator;

public class TestDatabase {
	
	public static void main( String[] args ) throws Exception
    {
		SqlDocGenerator wg = new SqlDocGenerator();
		wg.createSqlDoc("dev.examples.mysql.models.User");
		wg.print();
		wg.write();
    }
}