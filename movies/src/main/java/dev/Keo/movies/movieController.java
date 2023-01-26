package dev.Keo.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")

public class movieController {

    @Autowired
    private movieService movieService;

    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies() {
        return new ResponseEntity<List<movie>>(movieService.allMovies(), HttpStatus.OK);
    }

}
