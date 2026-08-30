package com.example.demo.requestObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetCreateRequest {
    private String petName;
    private String petType;
    private Integer petAge;
    private String ownerPetName;
}
