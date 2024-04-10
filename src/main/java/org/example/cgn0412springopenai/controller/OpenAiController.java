package org.example.cgn0412springopenai.controller;


import lombok.RequiredArgsConstructor;
import org.example.cgn0412springopenai.service.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/open")
@RequiredArgsConstructor
public class OpenAiController {

    private final OpenAIService service;

    @GetMapping
    public String askQuestion(@RequestParam String q){
        return service.askQuestion(q);
    }
}
