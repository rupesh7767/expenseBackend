package com.example.ExpenseManager.using.react.Repository;

import com.example.ExpenseManager.using.react.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense , String> {

    public void deleteExpensesByTitle(String title);
}
