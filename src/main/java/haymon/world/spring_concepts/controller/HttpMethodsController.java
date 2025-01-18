package haymon.world.spring_concepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/methods")
public class HttpMethodsController {
	
	@GetMapping
	public String get() {
		return "GET request";
	}
}
