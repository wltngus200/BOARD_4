package com.green.boardver4.board;

import com.green.boardver4.board.model.*;
import com.green.boardver4.common.BoardPagingAllReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    int boardPost(BoardPostReq p){
        return mapper.boardPost(p);
    }
    int boardDelete(long BoardId){return mapper.boardDelete(BoardId);}
    int boardPut(BoardUpdateReq p){return mapper.boardPut(p);}
    List<BoardSelectAllRes> boardGetAll(BoardPagingAllReq p){return mapper.boardGetAll(p);}
    BoardSelectOneRes boardGetOne(long boardId){return mapper.boardGetOne(boardId);}
}
