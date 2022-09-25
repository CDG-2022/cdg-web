package com.cdg.web.db.entity;

import com.cdg.web.controller.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    List<Notice> findByTitleIsLike(String title);
}
