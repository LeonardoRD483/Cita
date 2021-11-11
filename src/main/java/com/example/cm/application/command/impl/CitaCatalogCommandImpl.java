package com.example.cm.application.command.impl;


import com.example.cm.application.command.CitaCatalogCommand;
import com.example.cm.application.domain.model.Cita;
import com.example.cm.application.domain.repository.CitaCatalogRepository;
import org.hibernate.query.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CitaCatalogCommandImpl implements CitaCatalogCommand {

    @Autowired
    private CitaCatalogRepository citaCatalogRepository;

    public CitaCatalogCommandImpl(CitaCatalogRepository citaCatalogRepository) {
        this.citaCatalogRepository = citaCatalogRepository;
    }

    @Override
    public Long addCita(Cita cita) {
        // esto deberia mandar al citaCatalog


        return null;
    }

    @Override
    public Cita updateCita(Long citaId) {
        return null;
    }

    @Override
    public List<Cita> getAll(QueryParameter queryParameter) {
        return null;
    }

    @Override
    public void deleteCita(Long productId) {

    }

    @Override
    public Cita get(Long citaId) {
        return null;
    }
}
