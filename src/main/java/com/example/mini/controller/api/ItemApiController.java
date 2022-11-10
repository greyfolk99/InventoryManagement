package com.example.mini.controller.api;

import com.example.mini.dto.request.NewItemRequest;
import com.example.mini.dto.request.UpdateItemRequest;
import com.example.mini.dto.response.ItemResponse;
import com.example.mini.service.ItemService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/api/v1/item")
@RequiredArgsConstructor
public class ItemApiController {
    private final ItemService itemService;

    @GetMapping("/all")
    ResponseEntity<?> getAllitem() {
        try { return ResponseEntity.ok(itemService.selectAllItem());}
        catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
    @GetMapping("/{id}")
    ResponseEntity<?> getItem(@NotNull @PathVariable Long id) {
        try { return ResponseEntity.ok(itemService.selectItemById(id));}
        catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
    @PutMapping("/")
    ResponseEntity<?> postNewItem(@RequestBody NewItemRequest request) {
        try { return ResponseEntity.ok(itemService.createItem(request));}
        catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
    @PutMapping("/{id}")
    ResponseEntity<?> deleteItem(@NotNull @PathVariable Long id) {
        try { return ResponseEntity.ok(itemService.deleteItem(id));}
        catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
    @PutMapping("/")
    ResponseEntity<?> putItem(@RequestBody UpdateItemRequest request) {
        try { return ResponseEntity.ok(itemService.updateItem(request));}
        catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
        }
    }
}
