package Players;

import Simu.Team;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private Team teamName;
    private String role;
    private ArrayList<Integer> salary;

    public Player(String playerName, String role, Team teamName) {
        setPlayerName(playerName);
        setTeamName(teamName);
        setRole(role);
    }

    public Player() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Team getTeamName() {
        return teamName;
    }

    public void setTeamName(Team teamName) {
        this.teamName = teamName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Integer> getSalary() {
        return salary;
    }

    public void setSalary(ArrayList<Integer> salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", teamName=" + teamName +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
