package com.cdg.web.controller;

import com.cdg.web.controller.request.NoticeCreateRequest;
import com.cdg.web.controller.request.NoticeGetRequest;
import com.cdg.web.controller.request.NoticeModifyRequest;
import com.cdg.web.controller.response.NoticeResponse;
import com.cdg.web.controller.response.NoticesResponse;
import com.cdg.web.db.entity.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeRepository noticeRepository;

    @GetMapping("/notices")
    public ResponseEntity<NoticesResponse> getList(
            NoticeGetRequest request,
            @PageableDefault(size = 5, sort = "registerDate") Pageable pageable
    ) {
        Page<Notice> notices = noticeRepository.findAll(pageable);
        return ResponseEntity.ok(new NoticesResponse(notices));
    }

    @GetMapping("/notices/{id}")
    public ResponseEntity<NoticeResponse> get(@PathVariable Long id) {
        Notice notice = noticeRepository.findById(id).get();
        return ResponseEntity.ok(new NoticeResponse(notice));
    }

    @PostMapping("/notices")
    public ResponseEntity create(@RequestBody NoticeCreateRequest request) {
        noticeRepository.save(request.toDomain());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/notices/{id}")
    public ResponseEntity modify(
            @PathVariable Long id,
            @RequestBody NoticeModifyRequest request
    ) {
        // 대충 요청값이 유효한지 체크하는 로직
        // 대충 디비에서 꺼내오는 로직
        // 대충 꺼내온거 수정해서 업데이트 치는 로직
        Notice notice = noticeRepository.findById(id).get();
        notice.modify(request.getTitle(), request.getContents(), request.getUserId());
        noticeRepository.save(notice);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/notices/{id}")
    public ResponseEntity remove(@PathVariable Long id) {
        // 대충 요청값이 유효한지 체크하는 로직
        // 대충 디비에서 삭제하는 로직
        noticeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
