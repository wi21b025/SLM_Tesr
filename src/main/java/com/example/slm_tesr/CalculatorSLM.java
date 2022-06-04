package com.example.slm_tesr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorSLM {
    @RequestMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b){
        return a + b;
    }

    //http://localhost:8080/sum?a=1&b=2

    @RequestMapping("/multiply")
    public int multi(@RequestParam int a,@RequestParam int b){
        return a * b;
    }
    //http://localhost:8080/sum?a=1&b=2
}
