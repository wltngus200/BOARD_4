package com.green.boardver4.board;

import com.green.boardver4.board.model.*;
import com.green.boardver4.common.BoardPagingAllReq;
import com.green.boardver4.common.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @PostMapping
    public ResultDto<Integer> boardPost(@RequestBody BoardPostReq p){
        int result=service.boardPost(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    @DeleteMapping
    public ResultDto<Integer> boardDelete(@RequestParam long BoardId){
        int result=service.boardDelete(BoardId);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }

    @PutMapping
    public ResultDto<Integer> boardPut(@RequestBody BoardUpdateReq p){
        int result=service.boardPut(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }

    @GetMapping
    public ResultDto<List<BoardSelectAllRes>> boardGetAll (@ModelAttribute BoardPagingAllReq p){
        List<BoardSelectAllRes> result=service.boardGetAll(p);
        return ResultDto.<List<BoardSelectAllRes>>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    //@PathVariable swagger에서 값 입력 불가.
    //@RequestParam swagger 400 ERROR  "Required parameter 'p' is not present."
    //@ModelAttribute swagger 500 ERROR 신텍스

    @GetMapping("{boardId}")
    public ResultDto<BoardSelectOneRes> boardGetOne(@PathVariable long boardId){
        BoardSelectOneRes result=service.boardGetOne(boardId);
        return ResultDto.<BoardSelectOneRes>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }

}
