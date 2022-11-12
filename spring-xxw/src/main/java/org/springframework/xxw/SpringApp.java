package org.springframework.xxw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.springframework.xxw")
public class SpringApp {
	public static void main(String[] args) {
		System.out.println("hello spring");
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringApp.class);
		HelloSpringBean springBean = app.getBean(HelloSpringBean.class);
		System.out.println(springBean);
	}
}
