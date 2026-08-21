package com.example.data.local

import androidx.room.*
import com.example.data.model.QuestionEntity
import com.example.data.model.TokenEntity
import com.example.data.model.UserSessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {

    // --- QUESTIONS ---
    @Query("SELECT * FROM questions")
    fun getAllQuestions(): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions")
    suspend fun getAllQuestionsList(): List<QuestionEntity>

    @Query("SELECT * FROM questions WHERE kategori = :category")
    suspend fun getQuestionsByCategory(category: String): List<QuestionEntity>

    @Query("SELECT * FROM questions WHERE id_soal IN (:ids)")
    suspend fun getQuestionsByIds(ids: List<String>): List<QuestionEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestions(questions: List<QuestionEntity>)

    @Query("SELECT COUNT(*) FROM questions")
    suspend fun getQuestionCount(): Int


    // --- QUIZ SESSION ---
    @Query("SELECT * FROM user_sessions WHERE id = :sessionId LIMIT 1")
    fun getActiveSessionFlow(sessionId: Int): Flow<UserSessionEntity?>

    @Query("SELECT * FROM user_sessions WHERE id = :sessionId LIMIT 1")
    suspend fun getActiveSession(sessionId: Int): UserSessionEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateSession(session: UserSessionEntity)

    @Query("DELETE FROM user_sessions WHERE id = :sessionId")
    suspend fun deleteSession(sessionId: Int)


    // --- TOKENS ---
    @Query("SELECT * FROM tokens WHERE id = 1 LIMIT 1")
    fun getTokenFlow(): Flow<TokenEntity?>

    @Query("SELECT * FROM tokens WHERE id = 1 LIMIT 1")
    suspend fun getToken(): TokenEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateToken(token: TokenEntity)
}
