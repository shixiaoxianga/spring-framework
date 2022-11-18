package org.springframework.xxw.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InjectionPropertiesBean {

	@Value("${injection.text}")
	private String text;

	@PostConstruct
	public void init(){
		System.out.println(text);
	}
}
