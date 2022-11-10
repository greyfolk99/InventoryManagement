package com.example.mini.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InboundResponse {

    private Long id;

    private Long itemId;

    private int qtty;

    private String supplier;

    private Long staffId;

    private LocalDateTime inboundTime;

    @Builder
    public InboundResponse(Long id, Long itemId, int qtty, String supplier, Long staffId, LocalDateTime inboundTime) {
        this.id = id;
        this.itemId = itemId;
        this.qtty = qtty;
        this.supplier = supplier;
        this.staffId = staffId;
        this.inboundTime = inboundTime;
    }
}
