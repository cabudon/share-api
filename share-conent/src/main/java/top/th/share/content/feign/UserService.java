package top.th.share.content.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.th.share.common.resp.CommonResp;

/**
 * @author cabudon
 * @date 2023/10/13 15:35
 */

@FeignClient(value = "user-service",path = "/user")
public interface UserService {
    /**
     * 功能描述:调用用户中心查询用户信息接口
     * @param: id 用户id
     * @return:
     * @auther: cabudon
     * @date:  15:36
     */
    @GetMapping("/{id}")
    CommonResp<User> getUser(@PathVariable Long id);
}
