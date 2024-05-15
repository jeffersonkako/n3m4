package com.example.doma

import android.content.Context
import android.media.MediaPlayer

class AudioHelper(private val context: Context) {
    private var mediaPlayer: MediaPlayer? = null

    fun playAudio(audioResId: Int) {
        mediaPlayer = MediaPlayer.create(context, audioResId)
        mediaPlayer?.start()
    }

    fun stopAudio() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
