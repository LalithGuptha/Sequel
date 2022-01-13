package OptimalityCalculator;

public class Sponsor {

	private String name;
	private double contribution;
	private int reputation;

	public Sponsor(String name, double contribution, int reputation) {
		this.name = name;
		this.contribution = contribution;
		this.reputation = reputation;
	}

	@Override
	public String toString() {
		return "Sponsor{" +
				"name='" + name + '\'' +
				", contribution=" + contribution +
				", reputation=" + reputation +
				'}';
	}

	// java archive filerating
}
