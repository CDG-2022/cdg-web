package com.cdg.web.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
