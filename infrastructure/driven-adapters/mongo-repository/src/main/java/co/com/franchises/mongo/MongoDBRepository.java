package co.com.franchises.mongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<Object/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<Object/* change for adapter model */> {
}
