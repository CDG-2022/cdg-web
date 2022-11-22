package com.cdg.web.controller.request;

import com.cdg.web.db.entity.Notice;
import lombok.Data;

@Data
public class NoticeCreateRequest {
    private Long userId;
    private String title;
    private String contents;

    public Notice toDomain() {
        return new Notice(userId, title, contents);
    }
}
