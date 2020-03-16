package io.design.test;

import com.github.tools.generators.sqls.MyqlTableGenerator;

import test.test.models.User;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args ) throws Exception
    {
    	MyqlTableGenerator sql = new MyqlTableGenerator(
				"jdbc:mysql://127.0.0.1:3306/test",
				"com.mysql.cj.jdbc.Driver",
				"root", "root");
	sql.setDbName("test");
	sql.createDatabase();
	sql.createTable(User.class);
    }
}
