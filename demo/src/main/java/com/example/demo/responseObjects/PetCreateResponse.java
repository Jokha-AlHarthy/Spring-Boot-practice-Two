package com.example.demo.responseObjects;

import com.example.demo.entites.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PetCreateResponse {
    String petId;
    String petName;
    String petType;
    Integer petAge;
    String ownerPetName;

    public static PetCreateResponse convert(Pet pet){
        PetCreateResponse response = new PetCreateResponse();
        response.setPetId(pet.getId().toString());
        response.setPetName(pet.getName());
        response.setPetType(pet.getType());
        response.setPetAge(pet.getAge());
        response.setOwnerPetName(pet.getOwnerName());
        return response;
    }

    public static List<PetCreateResponse> convert(List<Pet> petList) {
        List<PetCreateResponse> responseList = new ArrayList<>();
        for (Pet p : petList) {
            responseList.add(convert(p));
        }
        return responseList;
    }
}
