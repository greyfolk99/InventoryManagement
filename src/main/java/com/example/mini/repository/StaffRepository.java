package com.example.mini.repository;

import com.example.mini.domain.outbound.Outbound;
import com.example.mini.domain.staff.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    @Override
    Optional<Staff> findById(Long aLong);
    List<Staff> findAll();
    @Override
    void deleteById(Long aLong);
}
