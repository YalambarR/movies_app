package dev.Keo.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class movieService {

    @Autowired
    private MovieRepository MovieRepository;

    public List<movie> allMovies() {

        return MovieRepository.findAll();
    }

    public Optional<movie> singleMovie(ObjectId id) {
        return MovieRepository.findById(id);
    }

}
