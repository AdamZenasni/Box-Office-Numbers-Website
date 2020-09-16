package uk.ac.city.aczg894.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg894.demo.dao.HistoryRepository;
import uk.ac.city.aczg894.demo.dao.WebsiteRepository;
import uk.ac.city.aczg894.demo.entites.CollatedUser;
import uk.ac.city.aczg894.demo.entites.LoginHistory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileServiceImpl implements ProfileService {


    /**
     * The repository for user data.
     */
    private WebsiteRepository websiteRepository;

    /**
     * The repository for login history.
     */
    private HistoryRepository historyRepository;


    /**
     *
     * Constructor based dependency injection of repositories.
     *
     * @param websiteRepository the website user repo
     * @param historyRepository the login history repo
     */
    @Autowired
    public ProfileServiceImpl(WebsiteRepository websiteRepository,
                                     HistoryRepository historyRepository){
        this.websiteRepository = websiteRepository;
        this.historyRepository = historyRepository;
    }

    /**
     * The implemented method that collates all the current users information
     * into a single object that will back the home.html view
     *
     * @param email the current user's email
     * @return CollatedUser a object that aggregates all the user's data.
     */
    @Override
    public CollatedUser getProfile(String email) {
        CollatedUser user = new CollatedUser();
        user.setwebsiteUser(websiteRepository.findById(email).orElseThrow(()-> new UsernameNotFoundException("No matching user found.")));
        List<LoginHistory> history = historyRepository.findAll()
                .stream().filter(loginHistory -> loginHistory.getEmail().equals(email))
                .collect(Collectors.toList());
        user.setLogins(history);
        return user;
    }
}
