package com.hk.auth.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 身份信息获取
 * 
 * @author wxt
 */
@RestController
@RequestMapping("/oauth")
public class UserController
{
    @RequestMapping("/user")
    public Principal user(Principal user)
    {
        return user;
    }
}
