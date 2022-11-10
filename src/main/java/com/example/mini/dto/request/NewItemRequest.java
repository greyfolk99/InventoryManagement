package com.example.mini.dto.request;

import com.example.mini.domain.item.Item;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewItemRequest {

    private String name;

    private String brand;

    private String category;

    public Item toEntity(){
        return Item.builder().name(name)
                .brand(brand)
                .category(category).build();
    }
}
