package com.green.boardver4.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter
@Setter
public class BoardPagingAllReq {
    private int page;
    private int length;
    @JsonIgnore
    private int startIdx;

    public BoardPagingAllReq(Integer page, Integer length){
        this.page=(page!=null?page:1);
        this.length=(length!=null?length:15);
        this.startIdx=(page-1)*length;
        //1,15 => 1~15, 16~30, 31~45
    }
}
