package PitchAnalysis;

public class Pace {

	private double friction;
	private double restitution;
	
	
	
	public Pace(double friction, double restitution) {
		super();
		this.friction = friction;
		this.restitution = restitution;
	}



	public double getFriction() {
		return friction;
	}



	public void setFriction(double friction) {
		this.friction = friction;
	}



	public double getRestitution() {
		return restitution;
	}



	public void setRestitution(double restitution) {
		this.restitution = restitution;
	}
	
	// find() - func def
	
}
