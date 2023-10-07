package top.th.share.user.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

/**
 * @author cabudon
 * @date 2023/10/07 10:25
 */

@SpringBootApplication
@ComponentScan("top.th")
@MapperScan("top.th.share.*.mapper")
@Slf4j
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(UserApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("测试地址：http://127.0.0.1:{}{}/hello", env.getProperty("server.port"), env.getProperty("server.servlet.context-path"));
    }
}
