package com.cdg.web.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "notice")
public class Notice {
    @Id
    @GeneratedValue
    @Column(name = "notice_id")
    private Long id;
    private Long userId;
    private String title;
    private String contents;
    private LocalDateTime registerDate;
    private LocalDateTime modifyDate;

    public Notice(Long userId, String title, String contents) {
        this.userId = userId;
        this.title = title;
        this.contents = contents;
        this.registerDate = LocalDateTime.now();
    }

    public void modify(String title, String contents, Long userId) {
        this.title = title;
        this.contents = contents;
        this.userId = userId;
        this.modifyDate = LocalDateTime.now();
    }
}
