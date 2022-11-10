package com.example.mini.repository;

import com.example.mini.domain.inbound.Inbound;
import com.example.mini.domain.outbound.Outbound;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InboundRepository extends JpaRepository<Inbound, Long> {
    @Override
    Optional<Inbound> findById(Long aLong);
    List<Inbound> findAll();
    @Override
    void deleteById(Long aLong);
}
