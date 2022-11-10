package com.example.mini.service.impl;

import com.example.mini.domain.outbound.Outbound;
import com.example.mini.domain.outbound.OutboundMapper;
import com.example.mini.dto.request.NewOutboundRequest;
import com.example.mini.dto.request.UpdateOutboundRequest;
import com.example.mini.dto.response.OutboundResponse;
import com.example.mini.repository.OutboundRepository;
import com.example.mini.service.OutboundService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OutboundServiceImpl implements OutboundService {

    private final Logger LOGGER = LogManager.getLogger(OutboundService.class);
    private final OutboundRepository outboundRepository;

    private OutboundResponse response(Outbound outbound){
        return OutboundMapper.INSTANCE.toResponse(outbound);
    }
    @Override
    public List<OutboundResponse> selectAllOutbound() {
        List<Outbound> outbounds = outboundRepository.findAll();
        if (outbounds.isEmpty()) throw new EntityNotFoundException("No data in db");
        return outbounds.stream().map(this::response).collect(Collectors.toList());
    }
    @Override
    public OutboundResponse selectOutboundById(Long id) {
        return response(outboundRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("no outbound found")));
    }
    @Override
    public OutboundResponse createOutbound(NewOutboundRequest request){
        return response(outboundRepository.save(request.toEntity()));
    }
    @Override
    public OutboundResponse updateOutbound(UpdateOutboundRequest request){
        Outbound outbound = outboundRepository.findById(request.getId())
                .orElseThrow(()->new NoSuchElementException("no outbound found"));
        return response(outbound.update(request));
    }
    @Override
    public boolean deleteOutbound(Long id){
        outboundRepository.deleteById(id);
        return outboundRepository.findById(id).isEmpty();
    }
}
