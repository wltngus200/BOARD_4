package com.green.boardver4.user;

import com.green.boardver4.common.ResultDto;
import com.green.boardver4.user.model.ChangePassReq;
import com.green.boardver4.user.model.JoinUserReq;
import com.green.boardver4.user.model.LogInUserReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    @PostMapping
    ResultDto<Integer> userPost(@RequestBody JoinUserReq p){
        int result=service.userPost(p);
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .result(result)
                .build();
    }
    @PutMapping
    ResultDto<Integer> userPut(ChangePassReq p){
        int result=service.userPut(p);
        String resultMsg=switch(result){
            case 1 -> "비밀번호 변경 완료";
            case 2 -> "아이디 없음";
            case 3 -> "비밀번호 틀림";
            default -> "예기치 못 한 에러";
        };
        return ResultDto.<Integer>builder()
                .status(HttpStatus.OK)
                .resultMsg(resultMsg)
                .result(result)
                .build();
    }
    @GetMapping("login")
    ResultDto<Integer> userPostLogIn(LogInUserReq p){
       int result=service.userPostLogIn(p);
       String resultMsg=switch(result){
           case 1 -> "로그인 성공";
           case 2 -> "아이디 없음";
           case 3 -> "비밀번호 틀림";
           default -> "예기치 못 한 에러";
       };
       return ResultDto.<Integer>builder()
               .status(HttpStatus.OK)
               .resultMsg(resultMsg)
               .result(result)
               .build();
    }
}
