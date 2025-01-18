package haymon.world.spring_concepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

	@GetMapping("/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a - b;
	}

	@GetMapping
	public int subtract(@RequestParam int a, int b) {
		return a + b;
	}
}
