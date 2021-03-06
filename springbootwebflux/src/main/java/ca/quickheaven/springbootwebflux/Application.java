package ca.quickheaven.springbootwebflux;

import greeting.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        GreetingWebClient client = new GreetingWebClient();
        System.out.println(client.getResult());
    }

}
