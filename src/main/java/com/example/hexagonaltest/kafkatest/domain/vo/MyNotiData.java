package com.example.hexagonaltest.kafkatest.domain.vo;

import lombok.Getter;

import java.io.Serializable;

// 네트워크 통신이 가능하다는 표시?? Serializable
@Getter
public class MyNotiData implements Serializable {

    private Long id;
    private String msg;

}
