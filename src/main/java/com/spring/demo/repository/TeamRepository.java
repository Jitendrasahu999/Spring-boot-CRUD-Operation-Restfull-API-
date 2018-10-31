package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> 
{

}
