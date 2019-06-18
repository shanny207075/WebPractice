package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("thisIsBean")
public class ThisIsMain {

	@Autowired
	ThisIsBean thisIsBean;

	public ThisIsBean getThisIsBean(String code, String name) {
		if (thisIsBean == null) {
			System.out.println("@@@ is  null @@@");
			thisIsBean = new ThisIsBean();
			thisIsBean.setCode(code);
			thisIsBean.setName(name);	
		}
		else {
			System.out.println("@@@ is not null @@@");			
			thisIsBean.setCode(code);
			thisIsBean.setName(name);
		}
		return thisIsBean;
	}
	
	@Bean
	public ThisIsBean createBean() {
		return new ThisIsBean();
	}

}
