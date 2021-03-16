package io.ms.microservicesconfigurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingController {

	@Value("${greating.message}")
	private String greatingMessage;
	
	
	@RequestMapping("/greating")
	public String getGreating() {
		return greatingMessage;
	}
}
