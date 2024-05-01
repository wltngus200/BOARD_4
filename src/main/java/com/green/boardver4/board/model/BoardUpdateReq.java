package com.green.boardver4.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardUpdateReq {
    private long boardId;
    private String title;
    private String contents;
}
