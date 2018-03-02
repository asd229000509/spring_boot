package cn.itcast.springboot;

import cn.itcast.springboot.properties.ItcastProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        //如果不希望输出spring boot得banner
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
