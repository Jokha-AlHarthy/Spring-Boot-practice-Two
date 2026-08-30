package com.example.demo;

import com.example.demo.entites.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static List<Pet> Pet_List = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
