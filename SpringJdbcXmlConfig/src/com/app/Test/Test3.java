package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test3 {

	public static void main(String[] args) {
   ApplicationContext ac=new ClassPathXmlApplicationContext("jdbcconfig.xml");
   JdbcTemplate jt=ac.getBean("jtObj",JdbcTemplate.class);
   String sql="update student set sname=? where sid=?";
   int count=jt.update(sql,"adva",101);
   System.out.println(count);
   
	}

}
