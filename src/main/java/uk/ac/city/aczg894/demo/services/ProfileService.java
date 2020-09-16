package uk.ac.city.aczg894.demo.services;

import uk.ac.city.aczg894.demo.entites.CollatedUser;

/**
 * Profile service interface that specifies a method to return a CollatedUser.
 */
public interface ProfileService {

    CollatedUser getProfile(String email);
}
