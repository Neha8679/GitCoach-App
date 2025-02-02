package com.neha.gitcoach.models.quiz

data class Quiz(
    val choices: List<String>,
    val correctAnswer: String,
    val id: Int,
    val question: String
)