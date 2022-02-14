package com.demo.Project1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Player { 
	 @Id
	 @GeneratedValue
	 private long id;
	 private String nickName;
	 @ManyToOne
	 @JoinColumn(name="team_id")      
	 private Team team;
	public long getId() {
		return id;
	}
	public Player() {
		super();
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Player(long id, String nickName, Team team) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.team = team;
	}

	
	}