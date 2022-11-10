package com.example.mini.service;

import com.example.mini.dto.request.NewInboundRequest;
import com.example.mini.dto.request.UpdateInboundRequest;
import com.example.mini.dto.response.InboundResponse;

import java.util.List;

public interface InboundService {

    List<InboundResponse> selectAllInbound();

    InboundResponse selectInboundById(Long id);

    InboundResponse createInbound(NewInboundRequest request);

    InboundResponse updateInbound(UpdateInboundRequest request);

    boolean deleteInbound(Long id);
}
