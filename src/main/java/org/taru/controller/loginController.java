package org.taru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.taru.domel.User;
import org.taru.service.LoginService;
import org.taru.vo.JsonResult;


@RestController
public class loginController {
    @Autowired
    LoginService loginServiceImpl;
    @RequestMapping("/api/login")
    public JsonResult login(@RequestParam("id") String id){
        JsonResult jsonResult=null;
        try {
            System.out.println("焊合件互动性文件为基础骄傲AC破位将参加");
            User user=loginServiceImpl.queryforLogin(id);
            System.out.println("卧槽");
            if (user != null) {
                jsonResult = new JsonResult("200", "登录成功", user);
            } else {
                jsonResult = new JsonResult("404", "登录失败", "");
            }
        } catch (Exception e) {
            e.getStackTrace();
            jsonResult = new JsonResult("500", "登录异常", e.getMessage());
        }
        return jsonResult;
    }
}
