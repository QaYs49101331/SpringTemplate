package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-10-04 18:58
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    public String Login(){

      return "index";
    }


}
