package org.lesson.java.thymeleaf.best_of_the_year.Controller;

import java.util.Arrays;
import java.util.List;

import org.lesson.java.thymeleaf.best_of_the_year.classi.Movie;
import org.lesson.java.thymeleaf.best_of_the_year.classi.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// con questa annotazione setto questo file come un controller
@Controller
// Indica che tutte le rotte (URL) gestite da questo controller iniziano con /
@RequestMapping("/")
public class HomeController {

    // creo il path che collega il file home.html a questo controller
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Bartolomeo");
        return "home";
    }

    // mwtodi che restituiscono oggetti canzoni e  film

    public List<Movie> getBestMovies() {
        return Arrays.asList(
            new Movie(1, "Inception"),
            new Movie(2, "The Dark Knight"),
            new Movie(3, "Interstellar")
        );
    }

    public List<Song> getBestSongs() {
        return Arrays.asList(
            new Song(1, "Iron Man - Black Sabbath"),
            new Song(2, "Smells Like Teen Spirit - Nirvana"),
            new Song(3, "Imagine - John Lennon")
        );
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }
    
    @GetMapping("/songs")
public String songs(Model model) {
    List<Song> songs = getBestSongs();
    model.addAttribute("songs", songs);
    return "songs";
    
    
}

// metodi per prendere gli id e mostrare i titoli corrispondenti


}
