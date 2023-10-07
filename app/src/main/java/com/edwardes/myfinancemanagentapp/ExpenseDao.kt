package com.edwardes.myfinancemanagentapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

//handling database operations.
@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: Expense)

    // Other database operations...
}