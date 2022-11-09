package com.example.mini.domain.inbound;

import com.example.mini.dto.request.NewInboundRequest;
import com.example.mini.dto.response.InboundResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InboundMapper {
    InboundMapper INSTANCE = Mappers.getMapper(InboundMapper.class);
    InboundResponse toResponse(Inbound inbound);
    Inbound toCreate(NewInboundRequest request);
}
