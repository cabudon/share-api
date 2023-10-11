package top.th.share.user.service;

import cn.hutool.log.Log;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.th.share.common.exception.BusinessException;
import top.th.share.common.exception.BusinessExceptionEnum;
import top.th.share.common.util.SnowUtil;
import top.th.share.user.domain.dto.LoginDTO;
import top.th.share.user.domain.entity.User;
import top.th.share.user.mapper.UserMapper;

import java.util.Date;

/**
 * @author cabudon
 * @date 2023/10/07 21:30
 */

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Long count() {
        return userMapper.selectCount(null);
    }

    public User login(LoginDTO loginDTO) {
        //    根据手机号查询用户
        User userDB = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getPhone, loginDTO.getPhone()));
        //    没找到，抛出运行时异常
        if (userDB == null) {
            //throw new RuntimeException("手机号不存在");
            throw new BusinessException(BusinessExceptionEnum.PHONE_NOT_EXIST);
        }
        //密码错误
        if (!userDB.getPassword().equals(loginDTO.getPassword())) {
            //throw new RuntimeException("密码错误");
            throw new BusinessException(BusinessExceptionEnum.PASSWORD_ERROR);
        }
        //    都正确，返回
        return userDB;
    }

    public Long register(LoginDTO loginDTO) {
        //    根据手机号查询用户
        User userDB = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getPhone, loginDTO.getPhone()));
        //    找到了，手机号已被注册
        if (userDB != null) {
            //throw new RuntimeException("手机号已被注册");
            throw new BusinessException(BusinessExceptionEnum.PHONE_EXIST);
        }
        User savedUser = User.builder()
                .id(SnowUtil.getSnowflakeNextId())
                .phone(loginDTO.getPhone())
                .password(loginDTO.getPassword())
                .nickname("新用户")
                .roles("user")
                .avatarUrl("https://i2.100024.xyz/2023/01/26/3exzjl.webp")
                .bonus(100)
                .createTime(new Date())
                .updateTime(new Date())
                .build();
        userMapper.insert(savedUser);
        return savedUser.getId();
    }
}
