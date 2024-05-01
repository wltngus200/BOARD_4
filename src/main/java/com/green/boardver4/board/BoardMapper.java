package com.green.boardver4.board;

import com.green.boardver4.board.model.*;
import com.green.boardver4.common.BoardPagingAllReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int boardPost(BoardPostReq p);
    int boardDelete(long BoardId);
    int boardPut(BoardUpdateReq p);
    List<BoardSelectAllRes> boardGetAll(BoardPagingAllReq p);
    BoardSelectOneRes boardGetOne(long boardId);
}
