package io.github.hexarchtraining.hts.bookings.adapter.out.jpa;

import io.github.hexarchtraining.hts.bookings.domain.Table;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TableMapper {

    TableMapper INSTANCE = Mappers.getMapper(TableMapper.class);

    @Mapping(target="id.value", source="id")
    Table toDomain(TableEntity entity);
}