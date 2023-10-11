package top.th.share.user.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import top.th.share.common.resp.CommonResp;
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
    public CommonResp<Long> count(){
        Long count = userService.count();
        CommonResp<Long> commonResp = new CommonResp<>();
        commonResp.setData(count);
        return commonResp;
    }

    @PostMapping("/login")
    public CommonResp<User> login(@Valid @RequestBody LoginDTO loginDTO){
        User user = userService.login(loginDTO);
        CommonResp<User> commonResp = new CommonResp<>();
        commonResp.setData(user);
        return commonResp;
    }

}
