package xyz.rfauzi.notepad

import android.app.Application

import xyz.rfauzi.notepad.data.DataStore

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStore.init(this)
    }
}