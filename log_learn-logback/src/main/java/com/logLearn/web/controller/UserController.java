package com.logLearn.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Created by jiangwang3 on 2018/1/30.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/info",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String showInfo(String name, Integer age){
        Map<String,String> map = new HashMap<String, String>();
        log.info("获取用户信息开始，name:{}，age:{}",name,age);
        map.put("name",name);
        map.put("age",age.toString());

        return map.toString();
    }
}
