package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.shubhammangla.blog.model.User;

@Repository
public interface UserRepository extends MongoRepository < User, String > {
	User findById(ObjectId id);
}

