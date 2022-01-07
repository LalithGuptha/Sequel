package project;

import Simu.Match;
import Simu.Team;

import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

public class MatchSchedule {
	
	private int noOfTeams;
	private Date startdate;
	private Date enddate;
	 private ArrayList <Team> teams;
	private Queue<Match> schedule ;


	public MatchSchedule(int noOfTeams, Date startdate, Date enddate, ArrayList<Team> teams, Queue<Match> schedule) {
		super();
		this.noOfTeams = noOfTeams;
		this.startdate = startdate;
		this.enddate = enddate;
		this.teams = teams;
		this.schedule = schedule;
	}


	public int getNoOfTeams() {
		return noOfTeams;
	}


	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public ArrayList<Team> getTeams() {
		return teams;
	}


	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}


	public Queue<Match> getSchedule() {
		return schedule;
	}


	public void setSchedule(Queue<Match> schedule) {
		this.schedule = schedule;
	}
	
	
	// schedule() - func
	// reschedule() - func
	// reschedule(,) - func
	// sendMail();
	// organiseeliminators() - ask renga
	
	
	
	
	
	
	
	

}
