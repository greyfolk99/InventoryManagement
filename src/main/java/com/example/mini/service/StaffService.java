package com.example.mini.service;

import com.example.mini.dto.request.NewStaffRequest;
import com.example.mini.dto.request.UpdateStaffRequest;
import com.example.mini.dto.response.StaffResponse;

import java.util.List;

public interface StaffService {
    List<StaffResponse> selectAllStaff();

    StaffResponse selectStaffById(Long id);

    StaffResponse createStaff(NewStaffRequest request);

    StaffResponse updateStaff(UpdateStaffRequest request);

    boolean deleteStaff(Long id);
}
