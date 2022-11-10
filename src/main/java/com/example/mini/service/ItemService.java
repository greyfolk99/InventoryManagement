package com.example.mini.service;

import com.example.mini.domain.item.Item;
import com.example.mini.dto.Header;
import com.example.mini.dto.request.NewItemRequest;
import com.example.mini.dto.request.UpdateItemRequest;
import com.example.mini.dto.response.ItemResponse;

import java.util.List;

public interface ItemService {

    ItemResponse response(Item item);

    List<ItemResponse> selectAllItem();

    ItemResponse selectItemById(Long id);

    ItemResponse createItem(NewItemRequest request);

    ItemResponse updateItem(UpdateItemRequest request);

    boolean deleteItem(Long id);
}
