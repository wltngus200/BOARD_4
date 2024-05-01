package com.green.boardver4.board.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardSelectAllRes {
    private long boardId;
    private String title;
    private long writerId;
    private int hits;
    private String createdAt;
    private String updatedAt;
}
