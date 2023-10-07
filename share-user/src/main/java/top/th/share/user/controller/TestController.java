package top.th.share.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cabudon
 * @date 2023/10/07 10:27
 */

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
