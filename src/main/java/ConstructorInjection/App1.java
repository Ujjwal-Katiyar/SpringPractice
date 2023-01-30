package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//setter Injection
//		ApplicationContext context = new ClassPathXmlApplicationContext("Injection/comfig.xml");
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
		
		
		//Constructor injection
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection/comfig.xml");
	Addresh addresh= context.getBean("add",Addresh.class);
	Student bean = context.getBean("student",Student.class);
	context.registerShutdownHook();
	
	System.out.println(bean);
	System.out.println(addresh);


	}
}
