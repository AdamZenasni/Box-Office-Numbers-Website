package uk.ac.city.aczg894.demo.services;

import uk.ac.city.aczg894.demo.entites.WebsiteUser;

/**
 * Registration service interface that specifies a method to save user information to the database.
 */
public interface RegistrationService {

    void registerUser(WebsiteUser websiteUser);
}
