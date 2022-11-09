package com.example.mini.domain.outbound;

import com.example.mini.dto.request.NewOutboundRequest;
import com.example.mini.dto.response.OutboundResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OutboundMapper {
    OutboundMapper INSTANCE = Mappers.getMapper(OutboundMapper.class);
    OutboundResponse toResponse(Outbound outbound);
    Outbound toCreate(NewOutboundRequest request);
}
