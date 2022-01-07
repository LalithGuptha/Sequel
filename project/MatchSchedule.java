package project;

import java.util.Date;
import java.util.Collection;

public class MatchSchedule {
	
	private int noOfTeams;
	private Date startdate = new Date();
	private Date enddate = new Date();
	public List <Team> teams = new List <Team>;
	public Queue <Match> schedule ;


	public MatchSchedule(int noOfTeams, Date startdate, Date enddate, List<Team> teams, Queue<Match> schedule) {
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


	public List<Team> getTeams() {
		return teams;
	}


	public void setTeams(List<Team> teams) {
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
