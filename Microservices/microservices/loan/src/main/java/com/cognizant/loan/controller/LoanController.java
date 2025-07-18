package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoanByNumber(@PathVariable String number) {
        Map<String, Object> loanDetails = new HashMap<>();
        loanDetails.put("number", number);
        loanDetails.put("type", "Car");
        loanDetails.put("amount", 400000);
        loanDetails.put("emi", 3258);
        loanDetails.put("tenure", 18);
        return loanDetails;
    }
}
