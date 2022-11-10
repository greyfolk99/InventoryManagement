package com.example.mini.domain.item;

import com.example.mini.dto.request.NewItemRequest;
import com.example.mini.dto.response.ItemResponse;

public class ItemMapperImpl implements ItemMapper{
    @Override
    public ItemResponse toResponse(Item item) {
        return null;
    }

    @Override
    public Item toCreate(NewItemRequest request) {
        return null;
    }
}
