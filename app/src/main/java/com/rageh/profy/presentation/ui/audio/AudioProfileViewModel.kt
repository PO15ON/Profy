package com.rageh.profy.presentation.ui.audio

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.rageh.profy.data.repository.AudioProfilesRepo
import com.rageh.profy.domain.profile.AudioHandler
import dagger.hilt.android.scopes.FragmentScoped

@FragmentScoped
class AudioProfileViewModel @ViewModelInject constructor(
    private val handler: AudioHandler,
    private val repo: AudioProfilesRepo
) :
    ViewModel() {

    val currentAudioProfile by lazy {
        handler.getCurrentProfile()
    }

    val maxLevelProfile by lazy {
        handler.getMaxLevelsProfile()
    }

    fun saveAudioProfile() = repo.insertIntoDB(currentAudioProfile)

}