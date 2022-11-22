package com.cdg.web.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "member")
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private int id;
    private String password;
    private String name;
    private String email;
    private String role;
    private LocalDateTime registerDate;
    private LocalDateTime modifyDate;
}
