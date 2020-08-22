package sihe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sihe.exception.ClientExcption;
import sihe.mapper.UserMapper;
import sihe.model.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user) {

        User exist  =userMapper.login(user);
        if (exist ==null)
            throw new ClientExcption("USR001","用户名密码校验失败");
        return exist;
    }
}
