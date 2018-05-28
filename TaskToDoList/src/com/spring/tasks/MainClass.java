//package com.spring.tasks;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.spring.tasks.Jdbcdoajava;
//
//public class MainClass {
//    public static void main(String arg[]) {
//	@SuppressWarnings("resource")
//	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
//	Jdbcdoajava jdbc=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
//	int task=jdbc.insertTask("Sleeping");
//	System.out.println(task);
//    }
//}
