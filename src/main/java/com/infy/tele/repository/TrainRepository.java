package com.infy.tele.repository;

import com.infy.tele.domain.Train;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Couchbase repository for the Train entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TrainRepository extends N1qlCouchbaseRepository<Train, String> {

}
