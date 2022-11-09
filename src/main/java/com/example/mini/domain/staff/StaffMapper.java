package com.example.mini.domain.staff;

import com.example.mini.dto.request.NewStaffRequest;
import com.example.mini.dto.response.StaffResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StaffMapper {
    StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);
    StaffResponse toResponse(Staff staff);
    Staff toCreate(NewStaffRequest request);
}
