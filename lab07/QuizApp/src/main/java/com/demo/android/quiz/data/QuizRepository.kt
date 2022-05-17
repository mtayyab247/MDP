package com.demo.android.quiz.data

import androidx.lifecycle.LiveData
import com.demo.android.quiz.data.model.Answer
import com.demo.android.quiz.data.model.Question
import com.demo.android.quiz.data.model.QuestionAndAllAnswers

interface QuizRepository {
    fun getSavedQuestions(): LiveData<List<Question>>

    fun saveQuestion(question: Question)

    fun saveAnswer(answer: Answer)

    fun getQuestionAndAllAnswers(): LiveData<List<QuestionAndAllAnswers>>

    fun deleteQuestions()
}