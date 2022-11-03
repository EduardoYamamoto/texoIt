package com.test.texoIt.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.texoIt.dto.MovieDTO;

public interface MovieRepository extends CrudRepository<MovieDTO, Integer> {

}
