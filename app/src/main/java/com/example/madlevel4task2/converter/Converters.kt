package com.example.madlevel4task2.converter
import androidx.room.TypeConverter
import com.example.madlevel4task2.model.Game
import java.util.*

class Converters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun resultToInt(result: Game.Result?): Int? {
        return result?.value
    }

    @TypeConverter
    fun fromInt(value: Int?): Game.Result? {
        return Game.Result.values().associateBy(Game.Result::value)[value]
    }
}