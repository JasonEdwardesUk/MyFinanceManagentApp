package com.edwardes.myfinancemanagentapp

import androidx.room.Entity
import androidx.room.PrimaryKey

//defining the schema of your database
@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val description: String,
    val amount: Double,
    val category: String,
    val date: Long
)