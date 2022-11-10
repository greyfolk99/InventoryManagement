package com.example.mini.domain.item;

import com.example.mini.dto.request.UpdateItemRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String category;

    @Builder
    public Item(Long id, String name, String brand, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
    }

    public void update(UpdateItemRequest request){
        id = request.getId();
        name = request.getName();
        brand = request.getBrand();
        category = request.getCategory();
    }
}

