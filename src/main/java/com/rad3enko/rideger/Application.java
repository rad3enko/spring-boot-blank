package com.rad3enko.rideger;

import com.whitesoft.util.CustomRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        CustomRunner.run(Application.class, args, SpringApplication::run);
    }
}
