package data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class User {
	String player;
	String job;
	String[] skill;
	Status status;
	// Map<String, Integer> status = new HashMap<>(); 
	
	Friendly[] friendly;

	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Friendly[] getFriendly() {
		return friendly;
	}
	public void setFriendly(Friendly[] friendly) {
		this.friendly = friendly;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkill() {
		return skill;
	}
	public void setSkill(String[] skill) {
		this.skill = skill;
	}
}
