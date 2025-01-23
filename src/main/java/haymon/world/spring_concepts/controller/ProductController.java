package haymon.world.spring_concepts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
//	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Product newProduct(Product product) {
		repository.save(product);
		return product;
	}
	
	@GetMapping
	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return repository.findById(id);
	}
	
	@PutMapping
	public Product updateProduct(Product product) {
		return repository.save(product);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteProductById(@PathVariable int id) {
		repository.deleteById(id);
	}
}
