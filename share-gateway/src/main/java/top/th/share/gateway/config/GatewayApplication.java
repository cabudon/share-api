package top.th.share.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author cabudon
 * @date 2023/10/07 19:46
 */

@SpringBootApplication
@ComponentScan("top.th")
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GatewayApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("网关启动成功！！");
        log.info("网关地址：http://127.0.0.1:{}", env.getProperty("server.port"));
    }
}