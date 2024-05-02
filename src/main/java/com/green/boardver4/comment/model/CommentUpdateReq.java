package com.green.boardver4.comment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentUpdateReq {
    private long commentId;
    private long writerId;
    private String contents;
}
