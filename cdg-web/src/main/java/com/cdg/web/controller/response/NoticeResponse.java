package com.cdg.web.controller.response;

import com.cdg.web.db.entity.Notice;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class NoticeResponse {
    private Long id;
    private Long userId;
    private String title;
    private String contents;
    private LocalDateTime registerDate;
    private LocalDateTime modifyDate;

    public NoticeResponse(Notice notice) {
        this.id = notice.getId();
        this.userId = notice.getUserId();
        this.title = notice.getTitle();
        this.contents = notice.getContents();
        this.registerDate = notice.getRegisterDate();
        this.modifyDate = notice.getModifyDate();
    }
}
