package com.revature.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Gives some extra clarity in our status code if this exception is thrown
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PetNotFoundException extends Exception{

    public PetNotFoundException() {
        // calling the parent constructor
        super("The Pet you are looking for does not exist.");
    }
}
