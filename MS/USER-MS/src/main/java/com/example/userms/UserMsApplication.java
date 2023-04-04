package com.example.userms;

import com.example.userms.model.User;
import com.example.userms.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class UserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (UserRepository UserRepository){
        User u1 = new User(null, "mfarrej", "neder", "nedermfarrej@gmail.com", "123","Employée");
        User u2 = new User(null, "Naghmouchi", "karim", "karimnaghmouchi@gmail.com", "123","Employeur");
        User u3 = new User(null, "jelidi", "dali", "dalijelidi@gmail.com", "123","Employeur");
        User u4 = new User(null, "Hedhli", "khalil", "hedhlikhalil@gmail.com", "123","Employeur");

        return args -> {
            UserRepository.save(u1);
            UserRepository.save(u2);
            UserRepository.save(u3);
            UserRepository.save(u4);

        };
    }

}
