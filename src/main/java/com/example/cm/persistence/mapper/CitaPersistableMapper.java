package com.example.cm.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CitaPersistableMapper {

public static final CitaPersistableMapper MAPPER = Mappers.getMapper(CitaPersistableMapper.class);


}
