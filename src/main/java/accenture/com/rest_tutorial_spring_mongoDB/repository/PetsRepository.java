package accenture.com.rest_tutorial_spring_mongoDB.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import accenture.com.rest_tutorial_spring_mongoDB.model.Pets;

public interface PetsRepository extends MongoRepository<Pets, String> {
	Pets findBy_id(ObjectId _id);
}