package com.infy.tele.service;

import com.infy.tele.domain.Train;
import com.infy.tele.repository.TrainRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Train.
 */
@Service
public class TrainService {

    private final Logger log = LoggerFactory.getLogger(TrainService.class);

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    /**
     * Save a train.
     *
     * @param train the entity to save
     * @return the persisted entity
     */
    public Train save(Train train) {
        log.debug("Request to save Train : {}", train);
        return trainRepository.save(train);
    }

    /**
     * Get all the trains.
     *
     * @return the list of entities
     */
    public List<Train> findAll() {
        log.debug("Request to get all Trains");
        return trainRepository.findAll();
    }


    /**
     * Get one train by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    public Optional<Train> findOne(String id) {
        log.debug("Request to get Train : {}", id);
        return trainRepository.findById(id);
    }

    /**
     * Delete the train by id.
     *
     * @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Train : {}", id);
        trainRepository.deleteById(id);
    }
}
