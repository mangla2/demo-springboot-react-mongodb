package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import in.shubhammangla.blog.model.Tags;

@Repository
public interface TagsRepository extends MongoRepository<Tags,String> {
	Tags findById(ObjectId id);
}