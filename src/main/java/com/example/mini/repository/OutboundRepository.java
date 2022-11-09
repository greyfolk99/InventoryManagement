package com.example.mini.repository;

import com.example.mini.domain.outbound.Outbound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboundRepository extends JpaRepository<Outbound, Long> {
}
