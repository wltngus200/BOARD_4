package com.green.boardver4.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogInUserReq {

    private String uid;
    private String upw;
}
