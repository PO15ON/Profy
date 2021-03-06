package com.rageh.profy.presentation.ui.splash

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rageh.profy.data.repository.UserProfilesRepo
import com.rageh.profy.domain.profile.UserProfileHandler
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.launch

@ActivityRetainedScoped
class SplashViewModel @ViewModelInject constructor(
    private val repo: UserProfilesRepo,
    private val handler: UserProfileHandler
) :
    ViewModel() {
    val defaultProfile by lazy {
        repo.getDefaultUserProfile()
    }

    fun initDefaultProfile() = viewModelScope.launch { handler.createAndInsertDefaultProfile() }

}