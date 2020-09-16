package uk.ac.city.aczg894.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg894.demo.entites.LoginHistory;

/**
 * Class to access the database table backing the LoginHistory entity.
 */
@Repository
public interface HistoryRepository extends JpaRepository<LoginHistory, String> {

}
