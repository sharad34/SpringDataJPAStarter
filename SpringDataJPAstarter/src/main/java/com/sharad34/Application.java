package com.sharad34.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication is an alternative used for @Configuration, @EnableAutoConfiguration and @ComponentScan

// CommandLineRunner is used to use SpringBoot for a Standalone Application(non-web)

public class Application implements CommandLineRunner{

    public static void main(String[] args) throws Exception {

        //to set banner off
        // springApp.setBannerMode(Banner.Mode.OFF);
        // springApp.run(args);


        //Use the below code for a non-gui app
        //SpringApplication app = new SpringApplication(Application.class);
        //app.run(args);

        //Use the below code for a Swing application
        // new SpringApplicationBuilder(Application.class)
        //           .headless(false)
        //           .run(args);

      }

    @Override
    public void run(String... arg0) throws Exception {

      //write code as per the requirement

    }

}
