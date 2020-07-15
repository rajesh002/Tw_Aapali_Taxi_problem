package dao;

import daoInterface.TaxiInterface;
import model.Taxi;

public class SUV extends Taxi implements TaxiInterface{
	int basePrice=100;
	int baseDistance=5;
	int shortTripPrice=15;
	int additionalChrge=12;
	
	public SUV(int distance){
		this.setDistance(distance);
		this.setBasePrice(basePrice);
		this.setShortTripPrice(shortTripPrice);
		this.setAdditionalChrge(additionalChrge);
		this.setBaseDistance(baseDistance);
	}
	
	public void farePrice() {
		int distance=this.getDistance();
		int tempDistance;
		int finalFare=0;
		if(distance<=this.getBaseDistance())
			finalFare=(distance*this.getBasePrice());  //Distance less than or equal 5km
			
		else if(distance>this.getBaseDistance()){  //Distance greater than 5km
			tempDistance=distance-this.getBaseDistance();
			finalFare+=this.getBasePrice();
				
			if(tempDistance<=this.getShortTripDistance()) 
				finalFare+=this.getShortTripPrice()*tempDistance;  //Price calculating for Next 15km
				
			else {
				tempDistance=tempDistance-this.getShortTripDistance();
				finalFare+=this.getShortTripPrice()*this.getShortTripDistance();
				finalFare+=this.getAdditionalChrge()*tempDistance;   //Price calculating for remaing distance
				}
				
			}
		System.out.print("SUV - Rs. "+finalFare);
		}	
}
