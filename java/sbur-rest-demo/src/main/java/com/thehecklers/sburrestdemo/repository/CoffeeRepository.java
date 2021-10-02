package com.thehecklers.sburrestdemo.repository;

import com.thehecklers.sburrestdemo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {}