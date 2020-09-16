package uk.ac.city.aczg894.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to handle GET requests to the home and user pages
 *
 */
@Controller
public class WebsiteController {
    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */    @RequestMapping(value = "/starWars")
    public ModelAndView showStarWars(){
        return new ModelAndView("starWars");
    }

    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */    @RequestMapping(value = "/avengers")
    public ModelAndView showAvengers(){
        return new ModelAndView("avengers");
    }

    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */    @RequestMapping(value = "/beauty")
    public ModelAndView showBeauty(){
        return new ModelAndView("beauty");
    }

    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */    @RequestMapping(value = "/fate")
    public ModelAndView showFate(){
        return new ModelAndView("fate");
    }

    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */
    @RequestMapping(value = "/jurassic")
    public ModelAndView showJurassic(){
        return new ModelAndView("jurassic");
    }

    /**
     * Controller method to handle a GET request to the /panther endpoint
     *
     * @return ModelAndView returns a view constructed from panther.html (no model required)
     */

    @RequestMapping(value = "/panther")
    public ModelAndView showPanther(){
        return new ModelAndView("panther");
    }
}
