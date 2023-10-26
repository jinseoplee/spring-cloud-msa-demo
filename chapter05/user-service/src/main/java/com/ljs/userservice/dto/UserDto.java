package com.ljs.userservice.dto;

import com.ljs.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String email;
    private String name;
    private String password;
    private String userId;
    private Date createdAt;
    private String encryptedPassword;
    private List<ResponseOrder> orders;
}
