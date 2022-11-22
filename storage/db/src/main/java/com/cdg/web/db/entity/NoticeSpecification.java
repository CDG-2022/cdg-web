package com.cdg.web.db.entity;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

public class NoticeSpecification {

    public static Specification<Notice> equalUserId(Long userId) {
        return (root, query, criteriaBuilder) -> userId != null ? criteriaBuilder.equal(root.get("userId"), userId) : null;
    }

    public static Specification<Notice> likeTitle(String title) {
        return (root, query, criteriaBuilder) -> StringUtils.isNotBlank(title) ? criteriaBuilder.like(root.get("title"), "%" + title + "%") : null;
    }

    public static Specification<Notice> likeContents(String contents) {
        return (root, query, criteriaBuilder) -> StringUtils.isNotBlank(contents) ? criteriaBuilder.like(root.get("contents"), "%" + contents + "%") : null;
    }
}
