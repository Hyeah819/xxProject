package com.zgc.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class QuickStartController {
    @RequestMapping("/quickVisit.do")
    @ResponseBody
    public String quickVisit(){

        log.debug("quickVisit.do is running!");
        return "springBoot 访问成功！";
    }
}
