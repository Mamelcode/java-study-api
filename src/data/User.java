package data;

import java.io.ObjectInputFilter.Status;
import java.util.HashMap;
import java.util.Map;

public class User {
	String player;
	String job;
	String[] skill;
	Status stat;
	Map<String, Integer> status = new HashMap<>(); 
	
	Friendly[] friendly;
	
	public Friendly[] getFriendly() {
		return friendly;
	}
	public void setFriendly(Friendly[] friendly) {
		this.friendly = friendly;
	}
	public Status getStat() {
		return stat;
	}
	public void setStat(Status stat) {
		this.stat = stat;
	}
	public Map<String, Integer> getStatus() {
		return status;
	}
	public void setStatus(Map<String, Integer> status) {
		this.status = status;
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
