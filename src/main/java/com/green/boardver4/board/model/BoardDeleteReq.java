package com.green.boardver4.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDeleteReq {
    private long boardId;
    private long userId;
}
