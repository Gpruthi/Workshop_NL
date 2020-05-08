package com.example.sample;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.sample.entities.Address;
import com.example.sample.entities.CallbacksUsingAnnotation;
import com.example.sample.entities.Employee;
import com.example.sample.entities.InstantiationWithInstanceFactoryMethod;
import com.example.sample.entities.InstantiationWithStaticFactoryMethod;
import com.example.sample.entities.JavaCollection;
import com.example.sample.entities.LazyInitialization;
import com.example.sample.entities.OuterBean;
import com.example.sample.entities.ParentBean;
import com.example.sample.entities.CallbacksUsingXML;
import com.example.sample.entities.ChildBean;
import com.example.sample.services.SampleService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@ImportResource({"classpath*:applicationContext.xml"})
public class SampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SampleApplication.class, args);
		
//		ApplicationContext context =
//		    	new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml",
//		              "connection.xml"});
//		
	
		
		//Dependency injection with xml
		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SampleApplication.class, args); SampleService service =
		 * applicationContext.getBean(SampleService.class);
		 * service.message("Sample Message");
		 */
		
		
		//Scope 
		
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 System.out.println("Application context initialized!!!");
		 
		 Employee emp1 = (Employee) context.getBean("employee");
		 Address add = (Address) context.getBean("address");
		 add.setState("HRY");
		 emp1.setFirstName("Garima"); 
		 emp1.setLastName("Pruthi");
		 emp1.setAddress(add);
		 emp1.employeeDetails();
		 
		 Employee emp2 = (Employee) context.getBean("employee");
		 Address add2 = (Address) context.getBean("address");
		 add2.setState("PNB");
		 emp2.setAddress(add2);
		 emp2.employeeDetails();
		 
		 CallbacksUsingXML in = (CallbacksUsingXML) context.getBean("callback");
		 System.out.println(in.hashCode());
		 
		 LazyInitialization lzy = (LazyInitialization) context.getBean("lazy"); 
		 lzy.show();
		 System.out.println("NAME: "+lzy.getName());
		 
		 JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		 jc.getList();
		 jc.getSet();
		 jc.getMap();
		 jc.getProp();
		 
		 OuterBean ob = (OuterBean) context.getBean("outer");
		 System.out.println(context.getType("outer")); 
		 ob.show();
		 	
		 InstantiationWithInstanceFactoryMethod ins = context.getBean("ins", InstantiationWithInstanceFactoryMethod.class);
		 
		 ParentBean pBean = (ParentBean) context.getBean("parentBean");
		 pBean.getVar1();
		 pBean.getVar2();
		 
		 ChildBean cBean = (ChildBean) context.getBean("childBean");
		 cBean.getVar1();
		 cBean.getVar3();
		 	 
		 context.close();
		
		
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(Config.class);
//		ctx.refresh();
//		
//		CallbacksUsingAnnotation cl = ctx.getBean(CallbacksUsingAnnotation.class);
//		System.out.println(cl.hashCode());
//		
//		Employee e = ctx.getBean(Employee.class);
//		e.show();
//		
//		LazyInitialization lzy = (LazyInitialization) ctx.getBean(LazyInitialization.class); 
//		lzy.show();
//		
//		e.stop();
//		if(!e.isRunning()) {
//			System.out.println("Not Running");
//		}
//			
//		ctx.registerShutdownHook();
		//ctx.close();
		 		 
		
	}

}
