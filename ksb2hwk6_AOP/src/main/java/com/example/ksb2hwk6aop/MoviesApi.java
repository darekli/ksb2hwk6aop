package com.example.ksb2hwk6aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/movies")

public class MoviesApi {

    TransferClass transferClass;
//    @Autowired
//    public MoviesApi(TransferClass transferClass) {
//        this.transferClass = transferClass;
//    }




    private List<Movies> moviesList;

    public MoviesApi() {
        this.moviesList = new ArrayList<>();
        moviesList.add(new Movies(1L, "Toy Story 4", 2019, "Pixar"));
        moviesList.add(new Movies(2L, "Django", 2012, "Quentin Tarantino"));
        moviesList.add(new Movies(3L, "Inception", 2010, "Christopher Nolan"));

    }

    public Integer getHowManyMovies() {
        int howManyMovies = moviesList.size();
        return howManyMovies;
    }

    @GetMapping
    public ResponseEntity<List<Movies>> getMovies() {
        return new ResponseEntity<>(moviesList, HttpStatus.OK);
    }


    @PostMapping

    public ResponseEntity addMovie(@RequestBody Movies movies) throws MessagingException {

        boolean add = moviesList.add(movies);

        if (add) {

            System.out.println("New movie added. All movies: " + moviesList.size());
//return transferClass.quantityMoviesController();
    return new ResponseEntity(HttpStatus.CREATED);

        }
   return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
      // return "No new movies added";
    }

}
