package com.sarthak.RestServices;

import com.sarthak.DTO.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sarthak on 26-10-2016.
 */
@RestController
public class AuthenticationService {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String hello(){
        return "Hello WOrld";
    }
    @RequestMapping(value ="/authenticate",method = RequestMethod.POST)
    public boolean authenticate(@RequestBody UserDTO userDTO){
        return userDTO.getName().equals("sarthak") && userDTO.getPassword().equals("abc123");
    }
}
