package org.fundatec.apirestmongo.repository;

import org.fundatec.apirestmongo.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowRepository extends MongoRepository<Show, String> {
}
