package com.example.cm.resource.mapper;

import com.example.cm.application.domain.model.Cita;
import com.example.cm.resource.model.CitaRequest;
import com.example.cm.resource.model.GetCitaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CitaRequestMapper {
    public static final CitaRequestMapper MAPPER = Mappers.getMapper(CitaRequestMapper.class);
    public abstract Cita map(CitaRequest request);
    public abstract GetCitaResponse map(Cita cita);
}
