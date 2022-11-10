package com.example.mini.repository;

import com.example.mini.domain.item.Item;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {

    @Override
    Optional<Item> findById(Long aLong);
    List<Item> findAll();
    List<Item> findByName();
    @Override
    void deleteById(Long aLong);

    Page<Item> findAll(Predicate predicate, Pageable pageable);
    List<Item> findAll(Predicate predicate);
}
