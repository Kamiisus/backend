package com.kxikw.develop.gable.repository;

import com.kxikw.develop.gable.model.History;
import org.springframework.data.repository.CrudRepository;


public interface HistoryRepository extends CrudRepository<History, String> {
    @Override
    void delete(History deleted);
}
