package model;

public class Taxi {
	private int distance;
	private int shortTripDistance=15;
	private int baseDistance;
	public int getBaseDistance() {
		return baseDistance;
	}
	public void setBaseDistance(int baseDistance) {
		this.baseDistance = baseDistance;
	}
	private int basePrice;
	private int shortTripPrice;
	private int additionalChrge;
	private int longTripPrice;
	private int longTripDistance;
	public int getLongTripDistance() {
		return longTripDistance;
	}
	public void setLongTripDistance(int longTripDistance) {
		this.longTripDistance = longTripDistance;
	}
	public int getShortTripDistance() {
		return shortTripDistance;
	}
	public void setShortTripDistance(int shortTripDistance) {
		this.shortTripDistance = shortTripDistance;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public int getShortTripPrice() {
		return shortTripPrice;
	}
	public void setShortTripPrice(int shortTripPrice) {
		this.shortTripPrice = shortTripPrice;
	}
	public int getAdditionalChrge() {
		return additionalChrge;
	}
	public void setAdditionalChrge(int additionalChrge) {
		this.additionalChrge = additionalChrge;
	}
	public int getLongTripPrice() {
		return longTripPrice;
	}
	public void setLongTripPrice(int longTripPrice) {
		this.longTripPrice = longTripPrice;
	}
	
}
