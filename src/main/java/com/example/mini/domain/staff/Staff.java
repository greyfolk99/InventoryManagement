package com.example.mini.domain.staff;

import com.example.mini.dto.request.UpdateStaffRequest;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accId;

    private String pwd;

    private String name;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private String phone;

    @Builder
    public Staff(Long id, String accId, String pwd, String name, Grade grade, String phone) {
        this.id = id;
        this.accId = accId;
        this.pwd = pwd;
        this.name = name;
        this.grade = grade;
        this.phone = phone;
    }

    public void update(UpdateStaffRequest request){
        id = request.getId();
        accId = request.getAccId();
        pwd = request.getPwd();
        name = request.getName();
        grade = request.getGrade();
        phone = request.getPhone();
    }
}
