package com.edwardes.myfinancemanagentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.edwardes.myfinancemanagentapp.database.AppDatabase
import com.edwardes.myfinancemanagentapp.database.Expense
import com.edwardes.myfinancemanagentapp.repository.ExpenseRepository
import com.edwardes.myfinancemanagentapp.repository.ExpenseViewModel
import com.edwardes.myfinancemanagentapp.repository.ExpenseViewModelFactory

// AppDatabase, Expense and ExpenseDao are the 3 basic classes for the room database
class MainActivity : ComponentActivity() {

    private lateinit var viewModel: ExpenseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = AppDatabase.getInstance(this)
        val repository = ExpenseRepository(database.expenseDao())
        val factory = ExpenseViewModelFactory(repository)

        viewModel = ViewModelProvider(this, factory).get(ExpenseViewModel::class.java)

        // Observe changes in the expenses data
        viewModel.getAllExpenses().observe(this, { expenses ->
            // Update UI with the new list of expenses
        })

        // Example: Inserting a new expense
        val newExpense = Expense(description = "Sample Expense", amount = 100.0, category = "Food", date = System.currentTimeMillis())
        viewModel.insertExpense(newExpense)
    }
}