package com.example.demo.requestObjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetUpdateRequest {
    String uuid;
    String petName;
    String petType;
    Integer petAge;
    String ownerPetName;
}
