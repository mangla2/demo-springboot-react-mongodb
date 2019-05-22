package in.shubhammangla.blog.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.shubhammangla.blog.model.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role,String> {
	Role findById(ObjectId id);
}
