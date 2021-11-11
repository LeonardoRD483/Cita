package com.example.cm.persistence.repository;


import com.example.cm.application.domain.model.Cita;
import com.example.cm.application.domain.repository.CitaCatalogRepository;
import org.hibernate.query.QueryParameter;

import java.util.List;

public class CitaPersistableRepositoryImpl implements CitaCatalogRepository {

    @Override
    public Long save(Cita cita) {
        return null;
    }

    @Override
    public Cita get(Long citaId) {
        return null;
    }

    @Override
    public List<Cita> getAll(QueryParameter queryParameter) {
        return null;
    }

    @Override
    public void delete(Long productId) {

    }
}
