package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shanny")
public class MainRestController {

	@Autowired
	ThisIsMain thisIsMain;
	
	@RequestMapping(value="/sayHello",method= RequestMethod.GET)
	public String testURL() {
		return thisIsMain.getThisIsBean("WWWW", "PPPP").getName();
	}

}
