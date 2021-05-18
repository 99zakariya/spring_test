package spring_test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hello {

	public static void main(String[] args) {
		AbstractApplicationContext aa=new ClassPathXmlApplicationContext("Spring.xml");
		ola b=aa.getBean("ola",ola.class);
		System.out.println("hello "+b.getName());

	}

}
