package com.example.mini.service.impl;

import com.example.mini.domain.staff.Staff;
import com.example.mini.domain.staff.StaffMapper;
import com.example.mini.dto.request.NewStaffRequest;
import com.example.mini.dto.request.UpdateStaffRequest;
import com.example.mini.dto.response.StaffResponse;
import com.example.mini.repository.StaffRepository;
import com.example.mini.service.StaffService;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {
    private final Logger LOGGER = LogManager.getLogger(StaffService.class);
    private final StaffRepository staffRepository;

    private StaffResponse response(Staff staff){
        return StaffMapper.INSTANCE.toResponse(staff);
    }
    @Override
    public List<StaffResponse> selectAllStaff() {
        List<Staff> staffs = staffRepository.findAll();
        if (staffs.isEmpty()) throw new EntityNotFoundException("No data in db");
        return staffs.stream().map(this::response).collect(Collectors.toList());
    }
    @Override
    public StaffResponse selectStaffById(Long id) {
        return response(staffRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("no staff found")));
    }
    @Override
    public StaffResponse createStaff(NewStaffRequest request){
        return response(staffRepository.save(request.toEntity()));
    }
    @Override
    public StaffResponse updateStaff(UpdateStaffRequest request){
        Staff staff = staffRepository.findById(request.getId())
                .orElseThrow(()->new NoSuchElementException("no staff found"));
        return response(staff.update(request));
    }
    @Override
    public boolean deleteStaff(Long id){
        staffRepository.deleteById(id);
        return staffRepository.findById(id).isEmpty();
    }
}
