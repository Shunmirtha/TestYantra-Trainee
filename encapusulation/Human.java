package com.te.learn.encapusulation;

public class Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;

	public Human() {
		super();
	}

	public Human(String humanName, int humanAge, int humanHeight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		// Verification and Validation
		if (humanAge < 0) {
			System.out.println("Age entered is not correct!");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {
		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 30) {
			System.out.println("Height entered is not correct!");
		} else {
			this.humanHeight = humanHeight;
		}

	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		if (humanWeight < 5) {
			System.out.println("Weight entered is not correct!");
		} else {
			this.humanWeight = humanWeight;
		}
	}

	public String getHumanName() {
		return humanName;
	}
}
