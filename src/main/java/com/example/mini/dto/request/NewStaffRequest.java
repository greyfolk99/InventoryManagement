package com.example.mini.dto.request;

import com.example.mini.domain.staff.Grade;
import com.example.mini.domain.staff.Staff;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewStaffRequest {

    private String accId;

    private String pwd;

    private String name;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private String phone;

    public Staff toEntity(){
        return Staff.builder()
                .accId(accId)
                .pwd(pwd)
                .name(name)
                .grade(grade)
                .phone(phone).build();
    }
}
