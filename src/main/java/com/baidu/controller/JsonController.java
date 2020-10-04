package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author shkstart
 * @create 2020-10-04 19:06
 */
@RestController
public class JsonController {

    @Autowired
    private UserService userservice;
    @RequestMapping("/getMessage")
    public List Model() throws ClassNotFoundException {

        List list = new ArrayList<>();
        list.add("SpringBoot");
        list.add(new Date());
        User user = new User("张三","123465",12);
        list.add(user);
        Map<String,String> map = new HashMap<String,String> ();
        map.put("金蝉","蝉鸣一夏");
        map.put("Servlet","dispatcherServlet");
        list.add(map);
        Object obj =  Class.forName("com.mysql.jdbc.Driver");
        list.add(obj.getClass());
        userservice.addUser(user);
        System.out.println("123456789");
        return list;

    }



}
