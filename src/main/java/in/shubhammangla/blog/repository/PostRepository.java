package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import in.shubhammangla.blog.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
	Post findById(ObjectId id);
}
