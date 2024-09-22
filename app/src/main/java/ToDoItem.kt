package com.example.todoapp

data class ToDoItem(
    val id: Long,
    var taskName: String,
    var description: String,
    var date: String,
    var time: String
)
