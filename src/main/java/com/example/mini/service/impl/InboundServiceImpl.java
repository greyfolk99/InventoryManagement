package com.example.mini.service.impl;

import com.example.mini.domain.inbound.Inbound;
import com.example.mini.domain.inbound.InboundMapper;
import com.example.mini.dto.request.NewInboundRequest;
import com.example.mini.dto.request.UpdateInboundRequest;
import com.example.mini.dto.response.InboundResponse;
import com.example.mini.repository.InboundRepository;
import com.example.mini.service.InboundService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class InboundServiceImpl implements InboundService {

    private final Logger LOGGER = LogManager.getLogger(InboundService.class);
    private final InboundRepository inboundRepository;

    private InboundResponse response(Inbound inbound) {
        return InboundMapper.INSTANCE.toResponse(inbound);
    }
    @Override
    public List<InboundResponse> selectAllInbound() {
        List<Inbound> inbounds = inboundRepository.findAll();
        if (inbounds.isEmpty()) throw new EntityNotFoundException("No data in db");
        return inbounds.stream().map(this::response).collect(Collectors.toList());
    }
    @Override
    public InboundResponse selectInboundById(Long id) {
        return response(inboundRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("no inbound found")));
    }
    @Override
    public InboundResponse createInbound(NewInboundRequest request) {
        return response(inboundRepository.save(request.toEntity()));
    }

    @Override
    public InboundResponse updateInbound(UpdateInboundRequest request) {
        Inbound inbound = inboundRepository.findById(request.getId())
                .orElseThrow(()->new NoSuchElementException("no inbound found"));
        return response(inbound.update(request));
    }
    @Override
    public boolean deleteInbound(Long id) {
        inboundRepository.deleteById(id);
        return inboundRepository.findById(id).isEmpty();
    }
}
