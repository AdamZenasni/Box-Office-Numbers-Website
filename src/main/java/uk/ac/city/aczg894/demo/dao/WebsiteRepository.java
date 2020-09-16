package uk.ac.city.aczg894.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg894.demo.entites.WebsiteUser;

/**
 * Class to access the database table backing the WebsiteUser entity.
 */
@Repository
public interface WebsiteRepository extends JpaRepository<WebsiteUser, String> {

}
