package com.dragonflydev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dragonfly on 2023-09-03
 */
@RestController
@RequestMapping(value = "/motto")
public class MottoController {

    @GetMapping
    public ResponseEntity<String> getMotto() {
        return ResponseEntity.ok("Mes que un club");
    }

    @GetMapping("/anthem")
    public ResponseEntity<String> getAnthemName() {
        return ResponseEntity.ok("El cant del Barca");
    }
}
