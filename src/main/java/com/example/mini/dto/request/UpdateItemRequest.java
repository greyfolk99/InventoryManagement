package com.example.mini.dto.request;

import com.example.mini.domain.item.Item;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateItemRequest {

    private Long id;
    private String name;
    private String brand;
    private String category;
}
