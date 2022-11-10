package com.example.mini.domain.inbound;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Inbound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long itemId;

    private int qtty;

    private String supplier;

    @Column(nullable = false)
    private Long staffId;

    private LocalDateTime inboundTime;

    @Builder
    public Inbound(Long id, Long itemId, int qtty, String supplier, Long staffId, LocalDateTime inboundTime) {
        this.id = id;
        this.itemId = itemId;
        this.qtty = qtty;
        this.supplier = supplier;
        this.staffId = staffId;
        this.inboundTime = inboundTime;
    }
}
