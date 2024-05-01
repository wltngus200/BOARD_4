package com.green.boardver4.comment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentPostReq {
    private String contents;
    private long writerId;
    private long boardId;
}
