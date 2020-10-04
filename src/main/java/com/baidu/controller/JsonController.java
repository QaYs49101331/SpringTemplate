package com.baidu.controller;

import com.baidu.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author shkstart
 * @create 2020-10-04 19:06
 */
@RestController
public class JsonController {

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
        return list;
    }

}
