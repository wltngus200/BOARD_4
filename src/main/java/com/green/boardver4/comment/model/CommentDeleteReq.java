package com.green.boardver4.comment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDeleteReq {
    private long commentId;
    private long writerId;
    private long boardId;
}
