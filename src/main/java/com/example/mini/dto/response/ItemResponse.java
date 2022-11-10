package com.example.mini.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ItemResponse {
    private Long id;

    private String name;
    private String brand;
    private String category;

    @Builder
    public ItemResponse(Long id, String name, String brand, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
    }
}
