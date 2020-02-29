package com.example.SpringDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;


public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);

//		Car c=new Car();
//		c.drive();
//
//		Bike b=new Bike();
//		b.drive();
//
//		Vehicle v=new Bike();
//		v.drive();

//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

//		Vehicle v=(Vehicle)context.getBean("bike");
//		v.drive();

//		Tyre t=(Tyre)context.getBean("tyre");
//		System.out.println(t);
//
//		Car c=(Car)context.getBean("car");
//		c.drive();

	ApplicationContext factory =new AnnotationConfigApplicationContext(Configration_class.class);

	Samsung s=(Samsung)factory.getBean(Samsung.class);
	s.config();






	}

}
