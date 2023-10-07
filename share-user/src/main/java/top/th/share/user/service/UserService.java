package top.th.share.user.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.th.share.user.mapper.UserMapper;

/**
 * @author cabudon
 * @date 2023/10/07 21:30
 */

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Long count(){
        return userMapper.selectCount(null);
    }
}
