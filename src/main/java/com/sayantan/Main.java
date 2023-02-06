package com.sayantan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse Greet() {
        return new GreetResponse("Hello", List.of("Java", "Golang", "Js"), new Person("Alex", 30, 30_000));
    }

    record Person(String name, int age, double savings){};
    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person){};

//    class GreetResponse {
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" + "greet='" + greet + '\'' + '}';
//        }
//    }
}
