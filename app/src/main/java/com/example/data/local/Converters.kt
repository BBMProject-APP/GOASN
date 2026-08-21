package com.example.data.local

import androidx.room.TypeConverter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.lang.reflect.Type

class Converters {
    private val moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    private val listType: Type = Types.newParameterizedType(List::class.java, String::class.java)
    private val mapType: Type = Types.newParameterizedType(Map::class.java, String::class.java, Any::class.java)
    private val mapIntType: Type = Types.newParameterizedType(Map::class.java, String::class.java, Int::class.javaObjectType)

    @TypeConverter
    fun fromStringList(value: String?): List<String>? {
        if (value.isNullOrBlank()) return null
        return moshi.adapter<List<String>>(listType).fromJson(value)
    }

    @TypeConverter
    fun toStringList(list: List<String>?): String? {
        if (list == null) return null
        return moshi.adapter<List<String>>(listType).toJson(list)
    }

    @TypeConverter
    fun fromStringMap(value: String?): Map<String, Int>? {
        if (value.isNullOrBlank()) return null
        return try {
            // Parse as Map<String, Any> first to handle Moshi's default Number parsing (usually Double)
            val rawMap = moshi.adapter<Map<String, Any>>(mapType).fromJson(value) ?: return null
            rawMap.mapValues { (_, v) ->
                when (v) {
                    is Number -> v.toInt()
                    is String -> v.trim().toIntOrNull() ?: 0
                    else -> 0
                }
            }
        } catch (e: Exception) {
            null
        }
    }

    @TypeConverter
    fun toStringMap(map: Map<String, Int>?): String? {
        if (map == null) return null
        return moshi.adapter<Map<String, Int>>(mapIntType).toJson(map)
    }
}
