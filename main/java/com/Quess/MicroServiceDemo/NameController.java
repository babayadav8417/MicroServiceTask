package com.Quess.MicroServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameConfigration nameConfigration;
    @GetMapping("/")
    public NameConfigration retrieveNames(){
        return new NameConfigration(nameConfigration.getMaxNo(),nameConfigration.getMinNo());
    }
}
