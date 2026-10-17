package de.htwberlin.notizapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class NoteController {

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> getNotes() {
        List<Note> notes = List.of(
                new Note(1L, "Einkaufen", "Milch, Brot, Eier", LocalDateTime.now()),
                new Note(2L, "Webtech", "MS1 bis 18.10. abgeben", LocalDateTime.now()),
                new Note(3L, "Idee", "Notizen später nach Datum sortieren", LocalDateTime.now())
        );
        return ResponseEntity.ok(notes);
    }
}