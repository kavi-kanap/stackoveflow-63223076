package com.custom;

import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MyRepository<Car, Long> {
}
