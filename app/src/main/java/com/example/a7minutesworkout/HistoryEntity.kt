package com.example.a7minutesworkout

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "History-table")
data class HistoryEntity(
    @PrimaryKey
    val date:String
)
