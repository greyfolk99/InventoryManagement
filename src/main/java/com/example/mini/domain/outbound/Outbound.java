package com.example.mini.domain.outbound;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Outbound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long itemId;

    private int qtty;

    private String supplier;

    private Long staffId;

    private LocalDateTime outboundTime;

    @Builder
    public Outbound(Long id, Long itemId, int qtty, String supplier, Long staffId, LocalDateTime outboundTime) {
        this.id = id;
        this.itemId = itemId;
        this.qtty = qtty;
        this.supplier = supplier;
        this.staffId = staffId;
        this.outboundTime = outboundTime;
    }
}
