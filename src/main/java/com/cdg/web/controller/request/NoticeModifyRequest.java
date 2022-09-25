package com.cdg.web.controller.request;

import lombok.Data;

@Data
public class NoticeModifyRequest {
    private String title;
    private String contents;
    private Long userId;
}
