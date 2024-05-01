package com.green.boardver4.user;

import com.green.boardver4.user.model.ChangePassReq;
import com.green.boardver4.user.model.JoinUserReq;
import com.green.boardver4.user.model.LogInUserReq;
import com.green.boardver4.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserMapper mapper;
    int userPost(JoinUserReq p){
        String password=BCrypt.hashpw(p.getUpw(),BCrypt.gensalt());
        p.setUpw(password);
        return mapper.userPost(p);
    }


    //1 비밀번호 변경 성공 2 아이디가 존재하지 않음 3 비밀번호 틀림
    int userPut(ChangePassReq p){
        UserEntity entity=mapper.findUid(p.getUid());
        if(entity==null){return 2;}
        if(!BCrypt.checkpw(p.getUpw(),entity.getUpw())){return 3;}
        String password=BCrypt.hashpw(p.getNewUpw(),entity.getUpw());
        //p는 내가 입력한 값, entity는 내가 입력한 아이디로 불러온 값
        p.setNewUpw(password);//ex.newUpw:aa123 -> 2%sd!da@$%@$de3
        p.setUserId(entity.getUserId());
        return mapper.userPut(p);//mapper의 해당 메소드를 실행한 결과를 보낸다
        //int 값= 영향받은 행 //그럼 실제로 바뀌는 순간은? userPut 메소드가 실행되는 순간
        //선생님 풀이에는 userId 값도 바꾸던데 왜지??
    }


    //1 로그인 성공 2 아이디 없음 3 비밀번호 틀림
    int userPostLogIn(LogInUserReq p){
        UserEntity entity=mapper.findUid(p.getUid());
        if(entity==null){return 2;}
        if(BCrypt.checkpw(p.getUpw(),entity.getUpw())){return 1;}
        return 3;
    }

}
