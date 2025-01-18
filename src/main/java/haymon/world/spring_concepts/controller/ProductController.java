package haymon.world.spring_concepts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import haymon.world.spring_concepts.model.entities.Product;
import haymon.world.spring_concepts.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@PostMapping
	public @ResponseBody Product newProduct(@RequestParam 
			String name, double price, double discount) {
		Product product = new Product(name, price, discount);
		repository.save(product);
		return product;
	}
}
