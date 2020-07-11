package com.example.merge;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car, Long>, CustomCarRepository {
}
