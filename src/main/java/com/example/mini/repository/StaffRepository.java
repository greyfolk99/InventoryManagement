package com.example.mini.repository;

import com.example.mini.domain.staff.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
