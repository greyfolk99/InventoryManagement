package com.example.mini.service.impl;

import com.example.mini.domain.item.Item;
import com.example.mini.domain.item.ItemMapper;
import com.example.mini.dto.request.NewItemRequest;
import com.example.mini.dto.request.UpdateItemRequest;
import com.example.mini.dto.response.ItemResponse;
import com.example.mini.repository.ItemRepository;
import com.example.mini.service.ItemService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final Logger LOGGER = LogManager.getLogger(ItemService.class);
    private final ItemRepository itemRepository;

    @Override
    public ItemResponse response(Item item){
        return ItemMapper.INSTANCE.toResponse(item);
    }
    @Override
    public List<ItemResponse> selectAllItem() {
        List<Item> items = itemRepository.findAll();
        if (items.isEmpty()) throw new EntityNotFoundException("No data in db");
        return items.stream().map(this::response).collect(Collectors.toList());
    }
    @Override
    public ItemResponse selectItemById(Long id) {
        return response(itemRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("no item found")));
    }
    @Override
    public ItemResponse createItem(NewItemRequest request){
        return response(itemRepository.save(request.toEntity()));
    }
    @Override
    public ItemResponse updateItem(UpdateItemRequest request){
        Item item = itemRepository.findById(request.getId())
                .orElseThrow(()->new NoSuchElementException("no item found"));
        return response(item.update(request));
    }
    @Override
    public boolean deleteItem(Long id){
        itemRepository.deleteById(id);
        return itemRepository.findById(id).isEmpty();
    }
}
