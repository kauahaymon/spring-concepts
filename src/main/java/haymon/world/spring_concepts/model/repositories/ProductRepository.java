package haymon.world.spring_concepts.model.repositories;

import org.springframework.data.repository.CrudRepository;
import haymon.world.spring_concepts.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
