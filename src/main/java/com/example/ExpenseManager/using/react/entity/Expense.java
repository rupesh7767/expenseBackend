package com.example.ExpenseManager.using.react.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "ExpenseManager")
public class Expense {

    @Id
    private String id;
    private String title;
    private Date date;
    private int amount;

}
