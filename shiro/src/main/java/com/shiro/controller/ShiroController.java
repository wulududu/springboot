package com.shiro.controller;

import com.shiro.entity.Result;
import com.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ShiroController {
    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @RequiresRoles("admin")
    @GetMapping("/users")
    public String users() {
        return "wulududu";
    }

    @RequiresPermissions("query")
    @GetMapping("/page")
    public String page() {
        return "page";
    }

    @GetMapping("/session")
    public String session(HttpSession session) {
        String sessionId = session.getId();
        return sessionId;
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return Result.success();
    }
}
