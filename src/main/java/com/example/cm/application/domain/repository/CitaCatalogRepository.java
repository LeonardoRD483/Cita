package com.example.cm.application.domain.repository;


import com.example.cm.application.domain.model.Cita;
import org.hibernate.query.QueryParameter;

import java.util.List;

public interface CitaCatalogRepository {

    Long save(Cita cita);
    Cita get(Long citaId);
    List<Cita> getAll(QueryParameter queryParameter);
    void delete(Long productId);
}
