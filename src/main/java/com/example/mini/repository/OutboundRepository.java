package com.example.mini.repository;

import com.example.mini.domain.item.Item;
import com.example.mini.domain.outbound.Outbound;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OutboundRepository extends JpaRepository<Outbound, Long> {
    @Override
    Optional<Outbound> findById(Long aLong);
    List<Outbound> findAll();
    @Override
    void deleteById(Long aLong);
}
