package top.th.share.common.interceptor;

import cn.hutool.core.util.RandomUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author cabudon
 * @date 2023/10/12 10:16
 */

@Component
public class Loginterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    //    增加日志流水号
        MDC.put("LOG_ID",System.currentTimeMillis()+ RandomUtil.randomString(3));
        return true;
    }
}
