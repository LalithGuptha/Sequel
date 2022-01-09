package project;

import Simu.Match;
import Simu.Team;

import java.time.LocalDate;
import java.util.ArrayList;
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






	public void schedule(){
		Match m1 = new Match(),m2,m3,m4 = new Match();
		int matchCount=1;


		//i tried
		int[][] arr={{0,1,2,3},{4,5,6,7}};
		String sch =new String();
		int t1,t2;

		m1.setMatchNumber(matchCount);
		m1.setDate(startdate);
		m1.setTeams(this.teams.get(arr[0][1]),this.teams.get(arr[1][1]));
		m1.setVenue(venues.get(arr[0][1]));
		schedule.add(m1);

		for(int i=0;i<4;i++)
		{

		}
		sch=sch+"..";
		for( int i=0;i<6;i++)
		{
			t1=arr[0][3];
			t2=arr[1][0];
			for(int j=3;j>1;j--) {
				arr[0][j] = arr[0][j - 1];

			}
			for(int n=0;n<3;n++){
				arr[1][n]=arr[1][n+1];
			}
			arr[1][3] = t1;
			arr[0][1] = t2;
			for(int k=0;k<4;k++)
			{
				sch= sch +"("+ arr[0][k]+","+arr[1][k]+")";
			}
			sch=sch+"..";
		}


		System.out.println(schedule.toString());

	}










	// reschedule() - func
	// reschedule(,) - func
	// sendMail();
	// organiseeliminators() - ask renga

	
	
	
	
	
	
	
	

}
