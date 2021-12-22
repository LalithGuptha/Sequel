package PitchAnalysis;

public class Rebound {

	private double radius;
	private double mass;
	private double spinRate;
	private double horizontalVelocityIn;
	private double verticalVelocityIn;
	private double horizontalVelocityOut;
	private double verticalVelocityOut;
	
	
	public Rebound(double radius, double mass, double spinRate, double horizontalVelocityIn, double verticalVelocityIn,
			double horizontalVelocityOut, double verticalVelocityOut) {
		super();
		this.radius = radius;
		this.mass = mass;
		this.spinRate = spinRate;
		this.horizontalVelocityIn = horizontalVelocityIn;
		this.verticalVelocityIn = verticalVelocityIn;
		this.horizontalVelocityOut = horizontalVelocityOut;
		this.verticalVelocityOut = verticalVelocityOut;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		this.mass = mass;
	}


	public double getSpinRate() {
		return spinRate;
	}


	public void setSpinRate(double spinRate) {
		this.spinRate = spinRate;
	}


	public double getHorizontalVelocityIn() {
		return horizontalVelocityIn;
	}


	public void setHorizontalVelocityIn(double horizontalVelocityIn) {
		this.horizontalVelocityIn = horizontalVelocityIn;
	}


	public double getVerticalVelocityIn() {
		return verticalVelocityIn;
	}


	public void setVerticalVelocityIn(double verticalVelocityIn) {
		this.verticalVelocityIn = verticalVelocityIn;
	}


	public double getHorizontalVelocityOut() {
		return horizontalVelocityOut;
	}


	public void setHorizontalVelocityOut(double horizontalVelocityOut) {
		this.horizontalVelocityOut = horizontalVelocityOut;
	}


	public double getVerticalVelocityOut() {
		return verticalVelocityOut;
	}


	public void setVerticalVelocityOut(double verticalVelocityOut) {
		this.verticalVelocityOut = verticalVelocityOut;
	}
	
	// find() - fun def
	
}
