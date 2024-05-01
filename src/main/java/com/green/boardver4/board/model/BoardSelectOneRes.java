package com.green.boardver4.board.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardSelectOneRes {
    private long boardId;
    private String title;
    private String contents;
    private long writerId;
    private String uid;
    private int hits;
    private String createdAt;
    private String updatedAt;
}
