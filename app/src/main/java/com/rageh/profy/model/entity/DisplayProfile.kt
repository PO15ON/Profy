package com.rageh.profy.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Ahmed on 2/27/2019.
 */
@Entity(tableName = "display_profiles")
data class DisplayProfile(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "user_profile_id")
    var userProfileId: Int
)