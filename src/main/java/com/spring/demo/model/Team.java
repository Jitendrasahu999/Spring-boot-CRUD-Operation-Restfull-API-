package com.spring.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int teamId;
	private String teamName;
	private String teamSpecialization;
	private int mamber;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamSpecialization() {
		return teamSpecialization;
	}

	public void setTeamSpecialization(String teamSpecialization) {
		this.teamSpecialization = teamSpecialization;
	}

	public int getMamber() {
		return mamber;
	}

	public void setMamber(int mamber) {
		this.mamber = mamber;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamSpecialization=" + teamSpecialization
				+ ", mamber=" + mamber + "]";
	}

}
