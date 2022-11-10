package com.example.mini.dto.response;

import com.example.mini.domain.staff.Grade;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StaffResponse {
    private Long id;

    private String accId;

    private String name;

    private Grade grade;

    private String phone;

    @Builder
    public StaffResponse(Long id, String accId, String name, Grade grade, String phone) {
        this.id = id;
        this.accId = accId;
        this.name = name;
        this.grade = grade;
        this.phone = phone;
    }
}
