package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Ola {
    @GetMapping(value = "/")
    public String getMethodName() {
        return "olá turma";
    }
}
