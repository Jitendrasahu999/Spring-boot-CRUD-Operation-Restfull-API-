package com.spring.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Team;
import com.spring.demo.repository.TeamRepository;

@RestController
public class TeamController {
	@Autowired
	TeamRepository teamRepository;

	//Get Team By Id
	@GetMapping(value = "/api/teamGetById")
	public Optional<Team> getById(int teamId) {
		return teamRepository.findById(teamId);
	}

	//Get All Team in JSON Formate 
	@GetMapping(value = "/api")
	public Iterable<Team> getAllTeam() {
		return teamRepository.findAll();
	}
	
	//Add Team in a Database(MySQL)
	@PostMapping(value = "/api/team")
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
	}
	
	//Edit Team by Id
	@PutMapping(value = "/api/team")
	public Team editTeam(Team team) {
		return teamRepository.save(team);
	}

	//Delete Team by Id
	@DeleteMapping("/api/team")
	public String deleteEmployee(@RequestParam int teamId) {
		Team emp = teamRepository.getOne(teamId);
		teamRepository.delete(emp);
		return "Data deleted";

	}

}
