package com.example.mini.dto.request;

import com.example.mini.domain.staff.Grade;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateStaffRequest {
    private Long id;
    private String accId;
    private String pwd;
    private String name;
    private Grade grade;
    private String phone;
}
