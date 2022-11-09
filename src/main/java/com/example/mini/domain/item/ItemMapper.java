package com.example.mini.domain.item;

import com.example.mini.dto.request.NewItemRequest;
import com.example.mini.dto.response.ItemResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);
    ItemResponse toResponse(Item item);
    Item toCreate(NewItemRequest request);
}
