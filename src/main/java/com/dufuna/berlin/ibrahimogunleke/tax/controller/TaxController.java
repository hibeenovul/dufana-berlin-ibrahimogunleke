package com.dufuna.berlin.ibrahimogunleke.tax.controller;
import com.dufuna.berlin.ibrahimogunleke.tax.service.TaxCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//RESTful Web Java Handler: Serializes return objects directly to the HTTP response body
@RestController
//Base URL Routing: Maps all HTTP requests starting with "/api/tax
@RequestMapping("/api/tax")
public class TaxController {
    private final TaxCalculatorService taxCalculatorService;

    public TaxController(TaxCalculatorService taxCalculatorService) {
        this.taxCalculatorService = taxCalculatorService;
    }

    // HTTP GET Handler: Maps GET requests
    @GetMapping("/calculate")
    public double calculateTax(@RequestParam(name = "income") double income) {
        return taxCalculatorService.calculateTax(income);
    }
}
