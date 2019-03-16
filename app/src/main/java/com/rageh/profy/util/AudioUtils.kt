package com.rageh.profy.util

import android.content.Context
import android.media.AudioManager
import com.rageh.profy.dagger.ScopeApplication
import javax.inject.Inject


/**
 * Created by Ahmed on 2/10/2019.
 */
@ScopeApplication
class AudioUtils @Inject constructor() {
    companion object {
        const val RINGING_MODE_RINGING = AudioManager.RINGER_MODE_NORMAL
        const val RINGING_MODE_SILENT = AudioManager.RINGER_MODE_SILENT
        const val RINGING_MODE_VIBRATION_ONLY = AudioManager.RINGER_MODE_VIBRATE
    }

    @Inject
    lateinit var context: Context
    @Inject
    lateinit var am: AudioManager

//

    fun setRingingMode(ringingMode: Int) {
        am.mode = ringingMode
    }

    fun setRingingLevel(level: Int) = am.setStreamVolume(AudioManager.STREAM_RING, level, 0)
    fun setCallLevel(level: Int) = am.setStreamVolume(AudioManager.STREAM_VOICE_CALL, level, 0)
    fun setMusicLevel(level: Int) = am.setStreamVolume(AudioManager.STREAM_MUSIC, level, 0)


    fun getMaxRingingLevel(): Int = am.getStreamMaxVolume(AudioManager.STREAM_RING)
    fun getMaxMusicLevel(): Int = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
    fun getMaxCallLevel(): Int = am.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL)


}