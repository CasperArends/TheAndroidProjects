package com.example.shoppinglistkotlin

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProductData::class], version = 1, exportSchema = false)

abstract class ShoppingListRoomDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDAO

    companion object {
        private const val DATABASE_NAME = "SHOPPING_LIST_DATABSE"

        @Volatile
        private var shoppingListRoomDatabaseInstance:
                ShoppingListRoomDatabase? = null

        fun getDatabase(context: Context): ShoppingListRoomDatabase?{
            if (shoppingListRoomDatabaseInstance == null){
                synchronized(ShoppingListRoomDatabase::class.java){
                    if (shoppingListRoomDatabaseInstance == null){
                        shoppingListRoomDatabaseInstance =
                            Room.databaseBuilder(context.applicationContext, ShoppingListRoomDatabase::class.java, DATABASE_NAME).build()
                    }
                }
            }
            return shoppingListRoomDatabaseInstance
        }
    }
}