package com.green.boardver4.user;

import com.green.boardver4.user.model.ChangePassReq;
import com.green.boardver4.user.model.JoinUserReq;
import com.green.boardver4.user.model.LogInUserReq;
import com.green.boardver4.user.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int userPost(JoinUserReq p);
    int userPut(ChangePassReq p);

    //로그인을 한다-> 포스트를 하면 새로운 멤버가 추가되고..
    //SELECT는 리턴값이 1이 되나.....?
    //update는 바꿔버리고.... delete도 지워버릴거고.....
    UserEntity userPostLogIn(String uid);

    UserEntity findUid(String uid);//아이디가 있는가
}

