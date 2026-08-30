package com.example.demo.services;

import com.example.demo.DemoApplication;
import com.example.demo.entites.Pet;
import com.example.demo.requestObjects.PetCreateRequest;
import com.example.demo.requestObjects.PetUpdateRequest;
import com.example.demo.utils.HelperUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetService {
    public static final String PET_ALREADY_TAKEN = "This pet already taken";
    public static final String PET_SAVED = "Pet Saved";

    //Service method - Add new pet method
    public Map<String, String> addPet(PetCreateRequest requestObj){
        Map<String, String> response = new HashMap<>();
        for (Pet p : DemoApplication.Pet_List) {
            if (p.getIsActive() && p.getName().equalsIgnoreCase(requestObj.getPetName()) && p.getType().equalsIgnoreCase(requestObj.getPetType()) && p.getOwnerName().equalsIgnoreCase(requestObj.getOwnerPetName())) {
                response.put("error", PET_ALREADY_TAKEN);
                return response;
            }
        }
        Pet pet = new Pet();

        pet.setId(UUID.randomUUID());
        pet.setIsActive(Boolean.TRUE);
        pet.setCreatedDate(new Date());
        pet.setName(requestObj.getPetName());
        pet.setType(requestObj.getPetType());
        pet.setAge(requestObj.getPetAge());
        pet.setOwnerName(requestObj.getOwnerPetName());

        Boolean result = DemoApplication.Pet_List.add(pet);

        if(result){
            response.put("response", PET_SAVED);
        }
        return response;
    }

    //Service method - get by Id pet method
    public Pet getPetById(String uuid) {
        for (Pet p : DemoApplication.Pet_List) {
            if (p.getId().toString().equals(uuid) && p.getIsActive() != false) {
                return p;
            }
        }
        return new Pet();
    }

    //Service method - get all pets method
    public List<Pet> getAllPets() {
        List<Pet> resultList = new ArrayList<>();
        for (Pet p : DemoApplication.Pet_List) {
            if (p.getIsActive()) {
                resultList.add(p);
            }
        }
        return resultList;
    }

    //Service method - update an existing pet method
    public Pet updatePet(PetUpdateRequest updateObj) {
        Pet pet = getPetById(updateObj.getUuid());
        if (pet == null || pet.getId() == null || !pet.getIsActive()) {
            return pet;
        }
        DemoApplication.Pet_List.remove(pet);
        pet.setUpdatedDate(new Date());
        pet.setName(HelperUtils.compare(pet.getName(), updateObj.getPetName()));
        pet.setType(HelperUtils.compare(pet.getType(), updateObj.getPetType()));
        pet.setAge(HelperUtils.compare(pet.getAge(), updateObj.getPetAge()));
        pet.setOwnerName(HelperUtils.compare(pet.getOwnerName(), updateObj.getOwnerPetName()));


        DemoApplication.Pet_List.add(pet);
        return pet;
    }

    //Service method - delete pet method
    public Boolean deleteById(String uuid) {
        Pet pet = getPetById(uuid);
        if (pet == null || pet.getId() == null || pet.getIsActive() != true) {
            return false;
        } else {
            DemoApplication.Pet_List.remove(pet);
            pet.setIsActive(false);
            DemoApplication.Pet_List.add(pet);
            return true;
        }
    }
}
