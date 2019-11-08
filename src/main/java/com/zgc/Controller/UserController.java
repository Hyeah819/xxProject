package com.zgc.Controller;

import com.zgc.pojo.User;
import com.zgc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller/*注意他和@restController的区别*/
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Integer id){
        return userService.queryUserById(id);
    }
    @RequestMapping("/all")
    public String all(ModelMap model){
        List<User> users = userService.selectAll();
        model.addAttribute("users",users);
        return "users";
    }
}
