package com.green.boardver4.comment;

import com.green.boardver4.comment.model.CommentDeleteReq;
import com.green.boardver4.comment.model.CommentPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentMapper mapper;

    int commentInsert(CommentPostReq p){
        return mapper.commentInsert(p);
    }
    int commentDelete(CommentDeleteReq p){
        return mapper.commentDelete(p);
    }
}
