package top.th.share.user.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.th.share.common.interceptor.Loginterceptor;

/**
 * @author cabudon
 * @date 2023/10/12 10:20
 */

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    private Loginterceptor loginterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginterceptor);
    }
}
