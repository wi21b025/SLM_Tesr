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
    //http://localhost:8080/multiply?a=1&b=2

    @RequestMapping("/absolute")
    public int absolute(@RequestParam int a){
        if(a < 0){
            return a*(-1);
        }
        return a;
    }
    //http://localhost:8080/absolute?a=-9





}
