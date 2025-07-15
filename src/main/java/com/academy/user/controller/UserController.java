package com.academy.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity<?> registration(@RequestBody String registrationRequest) {
        logger.info("User registration endpoint called");
        logger.debug("Registration request: {}", registrationRequest);
        return ResponseEntity.ok("Registration successful! Please check your email to activate your account.");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable(name = "id") String id) {
        logger.info("User getUser endpoint called");
        logger.debug("Retrieving user with ID: {}", id);
        return ResponseEntity.ok("User details for ID: " + id );
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getUsers() {
        logger.info("User getUser endpoint called");
        logger.debug("Retrieving all users");
        return ResponseEntity.ok("List of all users");
    }
}
