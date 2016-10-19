package com.example.controllers;

import com.example.model.Calculator;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/calculate")
public class CalculatorController {
    @RequestMapping(method = RequestMethod.GET)
    public int calculate(@RequestParam(value = "num1") int num1,
                         @RequestParam(value = "num2") int num2,
                         @RequestParam(value = "op") String op) {

        return getCalculation(num1, num2, op);
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public int postCalculate(@RequestBody Calculator calc) throws IOException {
        return getCalculation(calc.getNum1(), calc.getNum2(), calc.getOp());
    }

    private int getCalculation(int num1, int num2, String op) {
        int s = 0;
        if (op.equalsIgnoreCase("sum")) {
            s = num1 + num2;
        } else if (op.equalsIgnoreCase("sub")) {
            s = num1 - num2;
        } else if (op.equalsIgnoreCase("prod")) {
            s = num1 * num2;
        } else if (op.equalsIgnoreCase("div")) {
            s = num1 / num2;
        }
        return s;
    }

}

