package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import in.shubhammangla.blog.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository < Category, String > {
	Category findById(ObjectId id);
}
