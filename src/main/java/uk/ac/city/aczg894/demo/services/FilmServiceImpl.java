package uk.ac.city.aczg894.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg894.demo.dao.FilmRepository;
import uk.ac.city.aczg894.demo.entites.CollatedFilm;

@Service
public class FilmServiceImpl implements FilmService {

    /**
     * The repository for user data.
     */
    private FilmRepository filmRepository;



    /**
     *
     * Constructor based dependency injection of repositories.
     *
     * @param websiteRepository the user repo
     * @param historyRepository the login history repo
     * @param filmRepository the film repo
     */
    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository){
        this.filmRepository=filmRepository;
    }

    /**
     * The implemented method that collates all the current users information
     * into a single object that will back the home.html view
     *
     * @param email the current user's email
     * @return CollatedUser a object that aggregates all the user's data.
     */
    @Override
    public CollatedFilm getFilms() {
        CollatedFilm user = new CollatedFilm();
        user.setFilms(filmRepository.findAll());
        return user;
    }
}
