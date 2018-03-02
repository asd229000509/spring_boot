package cn.itcast.springboot.controller;

import cn.itcast.springboot.properties.ItcastProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private Environment environment;

    @Value("${cn.itcast.name}")
    private String itcastName;
    @Value("${cn.itcast.url}")
    private String url;
    @Value("${com.itheima.name}")
    private String itheimaName;

    @Autowired
    private ItcastProperties itcastProperties;

    @RequestMapping("/test3")
    public String sayHello() {
        System.out.println("a-name:" + environment.getProperty("cn.itcast.name"));
        System.out.println("a-url:" + environment.getProperty("cn.itcast.url"));
        System.out.println("b-name:" + environment.getProperty("com.itheima.name"));

        System.out.println("-----------------------------------------------");
        System.out.println("a-name:" + itcastName);
        System.out.println("a-url:" + url);
        System.out.println("itheima-name:" + itheimaName);

        System.out.println("------------------------------------------------");
        System.out.println("a-name:"+itcastProperties.getName());
        System.out.println("b-url:"+itcastProperties.getUrl());
        return "Hello World";
    }
}
