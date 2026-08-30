package com.example.demo.entites;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet extends BaseClass{
    private String name;
    private String type;
    private Integer age;
    private String ownerName;
}

