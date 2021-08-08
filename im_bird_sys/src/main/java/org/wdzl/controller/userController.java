package org.wdzl.controller;

import org.wdzl.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wdzl.services.UserServices;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    UserServices userServices;
    @RequestMapping("/getUser")
    public String getUserById(String id, Model model){
        User user=userServices.getUserById(id);
        model.addAttribute("user",user);
        return "user_list";
    }
}
