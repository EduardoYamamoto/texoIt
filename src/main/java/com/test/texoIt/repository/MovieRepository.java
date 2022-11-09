package com.test.texoIt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.texoIt.dto.MovieDTO;

@Repository
public interface MovieRepository extends CrudRepository<MovieDTO, Integer> {

}
