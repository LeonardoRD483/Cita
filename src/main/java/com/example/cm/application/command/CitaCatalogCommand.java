package com.example.cm.application.command;

import com.example.cm.application.domain.model.Cita;
import org.hibernate.query.QueryParameter;

import java.util.List;

public interface CitaCatalogCommand {

    Long addCita(Cita cita);
    Cita updateCita(Long citaId);
    List<Cita> getAll(QueryParameter queryParameter);
    void deleteCita(Long productId);
    Cita get(Long citaId);
}
