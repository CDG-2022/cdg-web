package com.cdg.web.controller.response;

import com.cdg.web.controller.Notice;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class NoticesResponse {
    private List<NoticeResponse> list;
    private long totalCount;
    private int page;
    private int size;

    public NoticesResponse(Page<Notice> notices) {
        this.list = notices.toList().stream().map(it -> new NoticeResponse(it)).collect(Collectors.toList());
        this.totalCount = notices.getTotalElements();
        this.page = notices.getNumber();
        this.size = notices.getSize();
    }
}
