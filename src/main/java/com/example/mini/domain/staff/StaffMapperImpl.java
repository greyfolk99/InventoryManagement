package com.example.mini.domain.staff;

import com.example.mini.dto.request.NewStaffRequest;
import com.example.mini.dto.response.StaffResponse;

public class StaffMapperImpl implements StaffMapper{
    @Override
    public StaffResponse toResponse(Staff staff) {
        return null;
    }

    @Override
    public Staff toCreate(NewStaffRequest request) {
        return null;
    }
}
