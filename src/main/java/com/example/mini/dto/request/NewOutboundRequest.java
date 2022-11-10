package com.example.mini.dto.request;

import com.example.mini.domain.outbound.Outbound;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)public class NewOutboundRequest {
    private Long itemId;

    private int qtty;

    private String supplier;

    private Long staffId;

    private LocalDateTime outboundTime;

    public Outbound toEntity(){
        return Outbound.builder()
                .itemId(itemId)
                .qtty(qtty)
                .supplier(supplier)
                .staffId(staffId)
                .outboundTime(outboundTime).build();
    }
}
