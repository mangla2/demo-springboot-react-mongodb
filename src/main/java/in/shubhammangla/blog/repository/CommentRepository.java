package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.shubhammangla.blog.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {
	Comment findById(ObjectId id);
}