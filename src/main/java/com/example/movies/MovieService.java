package com.example.movies;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public List<Movie> allMovies(){
        return repository.findAll();
    }


    public Optional<Movie> getSingleMovie(ObjectId id) {
        return repository.findById(id);
    }
    public Optional<Movie> getSingleMovieByImdbId(String id) {
        return repository.findMovieByImdbId(id);
    }
}
