package com.example.mini.service;

import com.example.mini.dto.request.NewOutboundRequest;
import com.example.mini.dto.request.UpdateOutboundRequest;
import com.example.mini.dto.response.OutboundResponse;

import java.util.List;

public interface OutboundService {
    List<OutboundResponse> selectAllOutbound();

    OutboundResponse selectOutboundById(Long id);

    OutboundResponse createOutbound(NewOutboundRequest request);

    OutboundResponse updateOutbound(UpdateOutboundRequest request);

    boolean deleteOutbound(Long id);
}
