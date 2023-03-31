package com.example.userms;

import com.example.userms.model.User;
import com.example.userms.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (UserRepository UserRepository){
        User u1 = new User(null, "mfarrej", "neder", "nedermfarrej@gmail.com", "123");
        User u2 = new User(null, "Naghmouchi", "karim", "karimnaghmouchi@gmail.com", "123");
        User u3 = new User(null, "jelidi", "dali", "dalijelidi@gmail.com", "123");

        return args -> {
            UserRepository.save(u1);
            UserRepository.save(u2);
            UserRepository.save(u3);

        };
    }
}
