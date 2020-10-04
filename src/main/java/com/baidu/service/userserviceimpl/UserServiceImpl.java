package com.baidu.service.userserviceimpl;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-10-04 22:16
 */
@Service
public class UserServiceImpl  implements UserService {

    @Override
    public void addUser(User user) {

        System.out.println(user);

    }

}
