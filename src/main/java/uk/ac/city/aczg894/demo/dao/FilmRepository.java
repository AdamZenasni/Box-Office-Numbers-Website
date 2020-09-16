package uk.ac.city.aczg894.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg894.demo.entites.Film;

import java.lang.annotation.Native;

@Repository
public interface FilmRepository extends JpaRepository<Film, String> {

}
/////Native