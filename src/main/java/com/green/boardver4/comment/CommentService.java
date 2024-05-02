package com.green.boardver4.comment;

import com.green.boardver4.comment.model.CommentDeleteReq;
import com.green.boardver4.comment.model.CommentPostReq;
import com.green.boardver4.comment.model.CommentUpdateReq;
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
    int commentPut(CommentUpdateReq p){
        return mapper.commentPut(p);
    }
}
