package haymon.world.spring_concepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import haymon.world.spring_concepts.model.entities.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@GetMapping("/any")
	public Client getClient() {
		return new Client(1, "Robson", "180.632.987-78");
	}
	
	@GetMapping("/{id}")
	public Client getByPathId(@PathVariable int id) {
		return new Client(id, "Roger", "998.342.987-98");
	}
	
	@GetMapping
	public Client getByParamId(
			@RequestParam(name = "id")
			int clientId) {
		return new Client(clientId, "Roger", "998.342.987-98");
	}
}
