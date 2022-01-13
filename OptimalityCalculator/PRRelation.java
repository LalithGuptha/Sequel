package OptimalityCalculator;

public class PRRelation {
    private String name;
    private String firm;
    public int a;      //rating argument in int...so as of now
    public Rating r ;
    private double experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Rating getR() {
        return r;
    }

    public void setR(Rating r) {
        this.r = r;
    }

    public PRRelation(String name, String firm, int r, double experience) {
        this.name = name;
        this.firm = firm;
        this.r = new Rating(a);
        this.experience = experience;
    }
}
