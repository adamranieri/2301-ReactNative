package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.dto.LoginRequest;
import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.exceptions.NameAlreadyExistsException;
import com.revature.springbootdemo.service.PetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller
// includes @Controller and @ResponseBody, indicating that it's a stereotype annotation and these methods
// should return a response body in the form of JSON
@RestController
// every single method in this class should be prefixed with /pets
@RequestMapping("/pets")
@CrossOrigin(origins = "http://localhost:3000")
public class PetController {

    // automatically inject the bean into this field:
    // Just declare the variable but don't need to instantiate it
    @Autowired
    PetService petService;

    // We use the Logger Factory to get a Logger for a particular class
    Logger logger1 = LoggerFactory.getLogger(PetController.class);


    // we do a post mapping for inserting new data
    @PostMapping()
    public Pet insert(@RequestBody Pet pet) throws NameAlreadyExistsException {
        // initialize Logger:
        logger1.info("Inserting; " + pet.toString());
        logger1.warn("This is a warning");
        logger1.error("This is an error");
        return petService.insert(pet);
        // WIth View Resolver, we would return the particular view we want to see
        // and the View Resolver would take this and redirect to the right view (ex: views/pet_view.jsp)
        // Since we're creating our views in React, this method just returns the JSON data and we let React decide how to present the data
        // return "pet_view";
    }

    // configuring this method to run when we send a get request to the end point /pets
    // http://localhost:8080/pets => [list of pets]
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Pet> getAll(@RequestParam(required = false, value = "flag") String flag) {
        System.out.println("Getting all pets");
        // if we don't pass in a request parameter flag, we should just get all pets
        if(flag == null) return petService.getAll();
        // Otherwise, call the overloaded method:
        else return petService.getAll(flag);
    }

    // @GetMapping is basically a shortcut for @RequestMapping method = RequestMethod.Get):
    // REST rule: for specific pet, we just add the id as a path variable instead of having a totally
    //separate endpoint:
//    @GetMapping("/{petId}")
//    // just make sure that the value passed into @PathVariable matches what we have in the request
//    public Pet getById(@PathVariable("petId") Long id) {
//        return petService.getById(id);
//    }
//
//    @GetMapping("/{petName}")
//    public List<Pet> getByName(@PathVariable("petName") String name) {
//        return petService.findByName(name);
//    }
    @GetMapping("/{petIdentifier}")
    public Pet getByIdOrName(@PathVariable("petIdentifier") String identifier) {
        try {
            Long id = Long.parseLong(identifier);
            return petService.getById(id);
        } catch(Exception e) {
            return petService.findByName(identifier).get(0);
        }
    }

    @PutMapping()
    public Pet update(@RequestBody Pet pet) {
        return petService.update(pet);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return petService.delete(id);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    // use our DTO to store only the username and password
    public Pet login(@RequestBody LoginRequest loginRequest) {

        // call login service here:

        return null;
    }
}
