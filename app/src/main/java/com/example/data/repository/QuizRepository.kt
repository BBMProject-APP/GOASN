package com.example.data.repository

import com.example.data.local.QuizDao
import com.example.data.soal.BankSoal
import com.example.data.model.QuestionEntity
import com.example.data.model.TokenEntity
import com.example.data.model.UserSessionEntity
import kotlinx.coroutines.flow.Flow

class QuizRepository(private val quizDao: QuizDao) {

    val allQuestionsFlow: Flow<List<QuestionEntity>> = quizDao.getAllQuestions()
    val activeSessionFlow: Flow<UserSessionEntity?> = quizDao.getActiveSessionFlow(1)
    val tokenFlow: Flow<TokenEntity?> = quizDao.getTokenFlow()

    suspend fun initializeApp() {
        // Pre-populate Questions if empty
        val count = quizDao.getQuestionCount()
        if (count == 0) {
            quizDao.insertQuestions(getPrepopulatedQuestions())
        }

        // Initialize Token if empty
        val token = quizDao.getToken()
        if (token == null) {
            quizDao.insertOrUpdateToken(TokenEntity(id = 1, tokenCount = 10))
        }
    }

    suspend fun getQuestionsByCategory(category: String): List<QuestionEntity> {
        return quizDao.getQuestionsByCategory(category)
    }

    suspend fun getAllQuestions(): List<QuestionEntity> {
        return quizDao.getAllQuestionsList()
    }

    suspend fun getQuestionsByIds(ids: List<String>): List<QuestionEntity> {
        return quizDao.getQuestionsByIds(ids)
    }

    suspend fun saveActiveSession(session: UserSessionEntity) {
        quizDao.insertOrUpdateSession(session)
    }

    suspend fun getActiveSession(): UserSessionEntity? {
        return quizDao.getActiveSession(1)
    }

    suspend fun deleteActiveSession() {
        quizDao.deleteSession(1)
    }

    // Safely deduct 1 token, returns true if success, false if 0 tokens
    suspend fun deductToken(): Boolean {
        val currentToken = quizDao.getToken() ?: TokenEntity(id = 1, tokenCount = 10)
        return if (currentToken.tokenCount > 0) {
            val newCount = currentToken.tokenCount - 1
            quizDao.insertOrUpdateToken(TokenEntity(id = 1, tokenCount = newCount))
            true
        } else {
            false
        }
    }

    // Securely add tokens (no local exploit, done via verified flow)
    suspend fun addTokens(amount: Int) {
        val currentToken = quizDao.getToken() ?: TokenEntity(id = 1, tokenCount = 10)
        val newCount = currentToken.tokenCount + amount
        quizDao.insertOrUpdateToken(TokenEntity(id = 1, tokenCount = newCount))
    }
    private fun getPrepopulatedQuestions(): List<QuestionEntity> {
        // Cukup panggil fungsi dari object BankSoal yang sudah kita buat!
        return BankSoal.ambilSemuaSoal()
    }
}
