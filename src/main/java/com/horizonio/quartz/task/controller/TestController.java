package com.horizonio.quartz.task.controller;

import com.horizonio.quartz.task.domain.ScheduleJob;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zqh07233 on 2016/5/27.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("testList")
    public String taskList(HttpServletRequest request) {
        return "base/test/testList";
    }

    @RequestMapping("/configPath/{test}")
    @ResponseBody
    public  String configPath(@PathVariable String test){
        return "request value:"+test;
    }

    @RequestMapping("/kk")
    public String test(){
        return "test";
    }
}
