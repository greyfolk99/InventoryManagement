package com.example.mini.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OutboundResponse {
    private Long id;

    private Long itemId;

    private int qtty;

    private String supplier;

    private Long staffId;

    private LocalDateTime outboundTime;

    @Builder
    public OutboundResponse(Long id, Long itemId, int qtty, String supplier, Long staffId, LocalDateTime outboundTime) {
        this.id = id;
        this.itemId = itemId;
        this.qtty = qtty;
        this.supplier = supplier;
        this.staffId = staffId;
        this.outboundTime = outboundTime;
    }
}
