package Players;

public class Bowler extends Player implements Salary{
    private int runsconceded, ballsbowled, wicketstaken, oversbowled, economy, maiden;

    public Bowler(Player player) {
        super(player.getPlayerName(), player.getRole(), player.getTeamName());
        setBallsbowled(0);
        setEconomy(0);
        setMaiden(0);
        setRunsconceded(0);
        setWicketstaken(0);
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

    @Override
    public void calcSalary() {

    }
}
