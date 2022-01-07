package Players;

import java.util.ArrayList;

public class Bowler extends Player {
    private int runsconceded, ballsbowled, wicketstaken, oversbowled, economy, maiden;
    public Bowler(String playerName, String teamName, String role, ArrayList<Integer> salary, int runsconceded, int ballsbowled, int wicketstaken, int oversbowled, int economy, int maiden) {
        super(playerName, teamName, role, salary);
        setRunsconceded(runsconceded);
        setBallsbowled(ballsbowled);
        setWicketstaken(wicketstaken);
        setOversbowled(oversbowled);
        setEconomy(economy);
        setMaiden(maiden);

    }

    public int getRunsconceded() {
        return runsconceded;
    }

    public void setRunsconceded(int runsconceded) {
        this.runsconceded = runsconceded;
    }

    public int getBallsbowled() {
        return ballsbowled;
    }

    public void setBallsbowled(int ballsbowled) {
        this.ballsbowled = ballsbowled;
    }

    public int getWicketstaken() {
        return wicketstaken;
    }

    public void setWicketstaken(int wicketstaken) {
        this.wicketstaken = wicketstaken;
    }

    public int getOversbowled() {
        return oversbowled;
    }

    public void setOversbowled(int oversbowled) {
        this.oversbowled = oversbowled;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public int getMaiden() {
        return maiden;
    }

    public void setMaiden(int maiden) {
        this.maiden = maiden;
    }

}
