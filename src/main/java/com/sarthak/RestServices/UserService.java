package com.sarthak.RestServices;

import com.sarthak.DTO.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sarthak on 27-10-2016.
 */

@RestController
public class UserService {
    @RequestMapping(value="/getUser")
    public UserDTO getUser(){
        UserDTO userDTO=new UserDTO();
        userDTO.setName("sar");
        userDTO.setPassword("abc123");
        return userDTO;
    }
}
