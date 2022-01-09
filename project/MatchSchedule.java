package project;

import Simu.Match;
import Simu.Team;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Queue;

public class MatchSchedule {
	
	private int noOfTeams;
	private LocalDate startdate;
	private LocalDate enddate;
	private ArrayList <Team> teams;
	private ArrayList<Venue> venues;
	private Queue<Match> schedule ;


	public MatchSchedule(int noOfTeams, LocalDate startdate, LocalDate enddate, ArrayList<Team> teams, ArrayList<Venue> venues) {
		this.noOfTeams = noOfTeams;
		this.startdate = startdate;
		this.enddate = enddate;
		this.teams = teams;
		this.venues = venues;
	}


	public int getNoOfTeams() {
		return noOfTeams;
	}


	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}


	public LocalDate getStartdate() {
		return startdate;
	}


	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}


	public LocalDate getEnddate() {
		return enddate;
	}


	public void setEnddate(LocalDate enddate) {
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

	public ArrayList<Venue> getVenues() {
		return venues;
	}

	public void setVenues(ArrayList<Venue> venues) {
		this.venues = venues;
	}
	// schedule() - func
	// reschedule() - func
	// reschedule(,) - func
	// sendMail();
	// organiseeliminators() - ask renga
	
	
	
	
	
	
	
	

}
