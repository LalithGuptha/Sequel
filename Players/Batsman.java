package Players;

import java.util.ArrayList;

public class Batsman extends Player implements Salary{

    private int runsscored, inningsplayed, notout, ballsfaced, noof4, noof6;
    public Batsman(String playerName, String teamName, String role, ArrayList<Integer> salary, int runsscored, int inningsplayed, int notout, int ballsfaced, int noof4, int noof6) {
        super(playerName, teamName, role, salary);
    }

    public int getRunsscored() {
        return runsscored;
    }

    public void setRunsscored(int runsscored) {
        this.runsscored = runsscored;
    }

    public int getInningsplayed() {
        return inningsplayed;
    }

    public void setInningsplayed(int inningsplayed) {
        this.inningsplayed = inningsplayed;
    }

    public int getNotout() {
        return notout;
    }

    public void setNotout(int notout) {
        this.notout = notout;
    }

    public int getBallsfaced() {
        return ballsfaced;
    }

    public void setBallsfaced(int ballsfaced) {
        this.ballsfaced = ballsfaced;
    }

    public int getNoof4() {
        return noof4;
    }

    public void setNoof4(int noof4) {
        this.noof4 = noof4;
    }

    public int getNoof6() {
        return noof6;
    }

    public void setNoof6(int noof6) {
        this.noof6 = noof6;
    }

    @Override
    public void calcSalary() {

    }
}
