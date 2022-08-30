package org.whr.controller;
//也应该纳入到Spring容器中管理，但是Controller和用户直接交互，建议分离spring，此例采用spring-mvc
//如何称为一个Controller呢

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.whr.domain.Uuser;
import org.whr.service.UuserService;

@Controller
//Controller和用户交互， 用户一般HTTP协议访问Controller，给不同的Controller和不同的方法映射不同的url地址，进行匹配
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UuserService uuserService;

    @RequestMapping("/register")
    public void reUser(Uuser uuser){ // 拼接结果   应用发布地址+类映射地址+方法映射地址  http://localhost:8080/whrzs_war/user/register
        boolean b = uuserService.reNewUser(uuser);
        System.out.println(b);
    }
}
