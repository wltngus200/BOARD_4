package com.green.boardver4.comment;

import com.green.boardver4.comment.model.CommentDeleteReq;
import com.green.boardver4.comment.model.CommentPostReq;
import com.green.boardver4.comment.model.CommentUpdateReq;
import com.green.boardver4.common.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService service;

    @PostMapping
    ResultDto<Integer> commentInsert(@RequestBody CommentPostReq p){
        int result= service.commentInsert(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    @DeleteMapping
    ResultDto<Integer> commentDelete(@RequestBody CommentDeleteReq p){
        int result=service.commentDelete(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();

    }
    @PutMapping
    ResultDto<Integer> commentPut(CommentUpdateReq p){
        int result=service.commentPut(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    //@GetMapping
}
