package uk.ac.city.aczg894.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg894.demo.dao.WebsiteRepository;
import uk.ac.city.aczg894.demo.entites.WebsiteUser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    /**
     * The repository for user data.
     */
    private WebsiteRepository websiteRepository;

    /**
     * Constructor based dependency injection
     *
     * @param websiteRepository the user repo.
     */
    @Autowired
    public RegistrationServiceImpl(WebsiteRepository websiteRepository){
        this.websiteRepository = websiteRepository;
    }

    /**
     * Saves a user to the database.
     *
     * @param websiteUser the user to be saved.
     */
    @Override
    public void registerUser(WebsiteUser websiteUser) {
        websiteRepository.save(websiteUser);
    }
}
