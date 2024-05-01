package com.green.boardver4.comment;

import com.green.boardver4.comment.model.CommentDeleteReq;
import com.green.boardver4.comment.model.CommentPostReq;
import com.green.boardver4.common.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService service;

    @PostMapping
    ResultDto<Integer> commentInsert(CommentPostReq p){
        int result= service.commentInsert(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    @DeleteMapping
    ResultDto<Integer> commentDelete(CommentDeleteReq p){
        int result=service.commentDelete(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();

    }
    //코멘트 넣기 에러 왜 나는지 모르겠네!!!!!!!!!!!
    //FK때문이래
}
