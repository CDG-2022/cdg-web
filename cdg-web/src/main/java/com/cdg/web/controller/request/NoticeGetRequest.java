package com.cdg.web.controller.request;

import com.cdg.web.db.entity.Notice;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import static com.cdg.web.db.entity.NoticeSpecification.*;

@Data
public class NoticeGetRequest {
    private Long userId;
    private String title;
    private String contents;

    public Specification<Notice> toCriteria() {
        return equalUserId(userId)
                .and(likeTitle(title))
                .and(likeContents(contents));
    }
}
