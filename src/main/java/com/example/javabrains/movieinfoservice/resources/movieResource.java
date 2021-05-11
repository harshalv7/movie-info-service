package com.example.javabrains.movieinfoservice.resources;

import com.example.javabrains.movieinfoservice.module.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class movieResource {

    @GetMapping("/{movieId}")
    public Movie getmovies(@PathVariable("movieId") String movieId){
     return  new Movie(movieId, "3 Idiots");

    }

}
