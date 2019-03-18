package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("jdbcconfig.xml");
       JdbcTemplate jt=ac.getBean("jtObj",JdbcTemplate.class);
       String sql="Insert into student values(?,?,?)";
       int count=jt.update(sql,102,"yogesh",29);
       System.out.println(count);
	}
}
