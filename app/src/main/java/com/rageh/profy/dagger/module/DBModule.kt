package com.rageh.profy.dagger.module

import android.content.Context
import androidx.room.Room
import com.rageh.profy.dagger.ApplicationScope
import com.rageh.profy.model.databse.SettingsProfilesDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Module
class DBModule {

    @Inject
    @Provides
    @ApplicationScope
    fun settingsProfilesDatabase(context: Context): SettingsProfilesDatabase {
        return Room.databaseBuilder(
            context.getApplicationContext(),
            SettingsProfilesDatabase::class.java, "settings_profiles"
        )
            .build()
    }
}