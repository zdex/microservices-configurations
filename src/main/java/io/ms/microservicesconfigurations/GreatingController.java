package io.ms.microservicesconfigurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingController {

	@Value("${greating.message}")
	private String greatingMessage;
	
	@Value("${greating.message1: this is the defalut message}")
	private String defalutMessage;
	
	@Value("${my.list}")
	private String myList;
	
	@Value("${my.dbvalues.as.object}")
	private String mydbValuesAsObject;
	
	@RequestMapping("/greating")
	public String getGreating() {
		return greatingMessage;
	}
	
	
	@RequestMapping("/defalutValue")
	public String getDefaultGreating() {
		return defalutMessage;
	}
	
	@RequestMapping("/mylist")
	public String getMyList() {
		System.out.println("my list is: " + this.myList);
		return myList;
	}
	
	@RequestMapping("/mydbvaluesasobject")
	public String mydbValuesAsObject() {
		System.out.println("mydbValuesAsObject: " + this.mydbValuesAsObject);
		return mydbValuesAsObject;
	}
}
