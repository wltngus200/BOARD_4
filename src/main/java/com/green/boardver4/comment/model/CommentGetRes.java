package com.green.boardver4.comment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CommentGetRes {
    private long writerId;
    private String contents;
    private String createdAt;

}
