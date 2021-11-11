package com.example.cm.application.domain.model;


import com.example.cm.application.domain.repository.CitaCatalogRepository;
import lombok.AllArgsConstructor;
import org.hibernate.query.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class CitaCatalog {

    @Autowired
    private CitaCatalogRepository citaCatalogRepository;

    public Long addCita(Cita cita) {
        Cita cita1 = new Cita();
        cita1.setDescripcion(cita.getDescripcion());
        cita1.setDoctor_id(cita.getDoctor_id());
        cita1.setEstado(cita.getEstado());
        cita1.setTitulo(cita.getTitulo());
        cita1.setUsuario_id(cita.getUsuario_id());
        return citaCatalogRepository.save(cita1);
    }

    public Long updateCita(Cita citaId) {
        return null;
    }

    public List<Cita> getAll(QueryParameter queryParameter) {
        return null;
    }

    public void deleteCita(Long productId) {

    }

    public Cita get(Long CitaId) {
        return null;
    }
}
