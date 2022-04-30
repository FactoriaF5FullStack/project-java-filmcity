package org.factoriaf5.projectjavafilmcity.repositories;

import org.factoriaf5.projectjavafilmcity.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {}