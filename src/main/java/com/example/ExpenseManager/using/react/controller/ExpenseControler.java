package com.example.ExpenseManager.using.react.controller;


import com.example.ExpenseManager.using.react.Repository.ExpenseRepository;
import com.example.ExpenseManager.using.react.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ExpenseControler {

    @Autowired
    ExpenseRepository expenseRepository;

    @CrossOrigin
    @GetMapping("/getExpenses")
    public List<Expense> getExpenses(){
        return expenseRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/saveExpenses")
    public void saveExpens(@RequestBody Expense expense){
        expenseRepository.save(expense);
    }
}
