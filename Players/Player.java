package Players;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private String teamName;
    private String role;
    private ArrayList<Integer> salary;

    public Player(String playerName, String teamName, String role, ArrayList<Integer> salary) {
        setPlayerName(playerName);
        setTeamName(teamName);
        setRole(role);
        setSalary(salary);
    }

    public Player() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
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
}
