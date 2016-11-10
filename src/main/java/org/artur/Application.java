package org.artur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by ARSOSNOW on 10/31/2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        final ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

    }
}
