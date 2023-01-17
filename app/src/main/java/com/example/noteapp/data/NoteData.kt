package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "test", description = "test"),
            Note(title = "test", description = "test"),
            Note(title = "test", description = "test"),
            Note(title = "test", description = "test"),
            Note(title = "test", description = "test")
        )
    }
}