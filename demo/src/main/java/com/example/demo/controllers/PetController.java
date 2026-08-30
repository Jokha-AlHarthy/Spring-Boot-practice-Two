package com.example.demo.controllers;

import com.example.demo.requestObjects.PetCreateRequest;
import com.example.demo.requestObjects.PetUpdateRequest;
import com.example.demo.responseObjects.PetCreateResponse;
import com.example.demo.responseObjects.PetUpdateResponse;
import com.example.demo.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("pet")
public class PetController {
    @Autowired
    public PetService petService;

    @PostMapping("add")
    public Map<String, String> addPet(@RequestBody PetCreateRequest pet){
        return petService.addPet(pet);
    }

    @GetMapping("getById")
    public PetCreateResponse getPetById(@RequestParam String uuid){
        return PetCreateResponse.convert(petService.getPetById(uuid));
    }

    @GetMapping("getAll")
    public List<PetCreateResponse> getAllPets() {
        return PetCreateResponse.convert(petService.getAllPets());
    }

    @PutMapping("update")
    public PetUpdateResponse updatePet(@RequestBody PetUpdateRequest updateObj) {
        return PetUpdateResponse.convert(petService.updatePet(updateObj));
    }

    @DeleteMapping("deleteById")
    public Boolean deletePetById(@RequestParam String id) {
        return petService.deleteById(id);
    }
}
