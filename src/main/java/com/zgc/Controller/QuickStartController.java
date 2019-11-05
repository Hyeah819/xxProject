package com.zgc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("/quickVisit")
    @ResponseBody
    public String quickVisit(){
        return "springBoot 访问成功！";
    }
}
