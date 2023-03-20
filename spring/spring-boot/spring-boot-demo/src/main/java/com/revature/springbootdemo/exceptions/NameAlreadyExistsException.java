package com.revature.springbootdemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// By default, trying to insert a duplicate name will return a 500 error
// If we create a custom exception and annotate it like so, then whenever this exception
// is thrown, we will return that corresponding status code:
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NameAlreadyExistsException extends Exception{
    public NameAlreadyExistsException() {
        super("Name already exists");
    }
}
