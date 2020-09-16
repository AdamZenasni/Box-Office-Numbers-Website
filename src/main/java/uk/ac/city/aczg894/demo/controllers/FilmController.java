package uk.ac.city.aczg894.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.city.aczg894.demo.entites.CollatedFilm;
import uk.ac.city.aczg894.demo.services.FilmService;

@Controller
public class FilmController {
    /**
     * The profile service which generates a "CollatedUser" object that contains references
     * to each of the domain objects (WebsiteUser and LoginHistory (as a list)
     *
     */
    private FilmService filmService;

    /**
     * Constructor based dependency injection of the profile service.
     *
     * @param profileService
     */
    @Autowired
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    /**
     * Controller method to respond to GET requests to the /profile endpoint.
     *
     * @return ModelAndView an object that returns the home.html view combined with the data
     * for the current logged in user (user info, login history list)
     */
    @RequestMapping(value="/")
    public ModelAndView showProfile(){
        //Retrieves the email address of the currently logged in user.
        CollatedFilm user = filmService.getFilms();
        return new ModelAndView("home", "films", user);
    }
    @RequestMapping(value="/compare")
    public ModelAndView uShitAtCoding(){
        //Retrieves the email address of the currently logged in user.
        CollatedFilm user = filmService.getFilms();
        return new ModelAndView("compare", "films", user);
    }
}



