package com.green.boardver4.comment;

import com.green.boardver4.comment.model.CommentDeleteReq;
import com.green.boardver4.comment.model.CommentPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    int commentInsert(CommentPostReq p);
    int commentDelete(CommentDeleteReq p);
}
