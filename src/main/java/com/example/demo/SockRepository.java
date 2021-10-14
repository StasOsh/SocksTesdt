package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SockRepository extends JpaRepository<Sock, Long> {

    @Query(value = "select count(s) from Sock s " +
            "where color = :color and cottonPart > :cottonPart")
    Integer findAllByColorAndCottonPartMoreThan(String color, Integer cottonPart);

    @Query(value = "select count(s) from Sock s " +
            "where color = :color and cottonPart < :cottonPart")
    Integer findAllByColorAndCottonPartLessThan(String color, Integer cottonPart);

    @Query(value = "select count(s) from Sock s " +
            "where color = :color and cottonPart = :cottonPart")
    Integer findAllByColorAndCottonPartEquals(String color, Integer cottonPart);

}
