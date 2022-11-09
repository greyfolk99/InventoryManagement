package com.example.mini.repository;

import com.example.mini.domain.inbound.Inbound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InboundRepository extends JpaRepository<Inbound, Long> {
}
