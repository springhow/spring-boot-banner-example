package com.springhow.examples.springboot.springbootbannerexample;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringBootBannerExampleApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBootBannerExampleApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.setBanner((environment, sourceClass, out) -> out.println("Hello Banner"));
        springApplication.run(args);

    }

}
