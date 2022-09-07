package com.example.demo.repositories;


import com.example.demo.entities.MonsterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRep extends JpaRepository<MonsterModel, Long> {

}
