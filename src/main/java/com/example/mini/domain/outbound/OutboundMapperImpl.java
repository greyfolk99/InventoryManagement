package com.example.mini.domain.outbound;

import com.example.mini.dto.request.NewOutboundRequest;
import com.example.mini.dto.response.OutboundResponse;

public class OutboundMapperImpl implements OutboundMapper{
    @Override
    public OutboundResponse toResponse(Outbound outbound) {
        return null;
    }

    @Override
    public Outbound toCreate(NewOutboundRequest request) {
        return null;
    }
}
