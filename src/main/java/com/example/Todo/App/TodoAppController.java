package com.example.Todo.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {

    @GetMapping("/")
    public String todoapplication() {
        return "To-do Application!";
    }
}
