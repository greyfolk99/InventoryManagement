package com.example.mini.dto.request;

import com.example.mini.domain.inbound.Inbound;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewInboundRequest {

    private Long itemId;

    private int qtty;

    private String supplier;

    private Long staffId;

    private LocalDateTime inboundTime;

    public Inbound toEntity(){
        return Inbound.builder().itemId(itemId)
        .qtty(qtty)
        .supplier(supplier)
        .staffId(staffId)
        .inboundTime(inboundTime).build();
    }
}
