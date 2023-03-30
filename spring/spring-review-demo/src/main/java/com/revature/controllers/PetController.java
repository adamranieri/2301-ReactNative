package com.revature.controllers;

import com.revature.entities.Pet;
import com.revature.exceptions.PetNotFoundException;
import com.revature.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Using the stereotype annotation to say this class is a component/bean in our Spring application
// being more specific that it is a Controller
@Controller
// Returning data as the response body
@ResponseBody
// Shortcut: @RestController = @Controller + @ResponseBody
@RequestMapping("/pets")
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping
    public Pet upsert(@RequestBody Pet pet) {
        return petService.upsert(pet);
    }

    @GetMapping("/{id}")
    public Pet getById(@PathVariable("id") Long id) throws PetNotFoundException {
        return petService.getById(id);
    }
}
