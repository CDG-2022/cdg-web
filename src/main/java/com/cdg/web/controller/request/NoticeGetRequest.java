package com.cdg.web.controller.request;

import lombok.Data;

@Data
public class NoticeGetRequest {
    private int page;
    private int size;
    private String title;
}
