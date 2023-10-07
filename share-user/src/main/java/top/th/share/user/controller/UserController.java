package top.th.share.user.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import top.th.share.user.domain.dto.LoginDTO;
import top.th.share.user.domain.entity.User;
import top.th.share.user.service.UserService;

/**
 * @author cabudon
 * @date 2023/10/07 21:33
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/count")
    public Long count(){
        return userService.count();
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginDTO loginDTO){
        return userService.login(loginDTO);
    }

}
