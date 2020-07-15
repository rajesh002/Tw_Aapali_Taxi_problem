package dao;

import daoInterface.TaxiInterface;
import model.Taxi;

public class Sedan extends Taxi implements TaxiInterface{
	int basePrice=80;
	int baseDistance=5;
	int shortTripPrice=12;
	int additionalChrge=10;
	int longTripPrice=10;
	int longTripDistance=100;
	public Sedan(int distance) {
		this.setDistance(distance);
		this.setBasePrice(basePrice);
		this.setShortTripPrice(shortTripPrice);
		this.setAdditionalChrge(additionalChrge);
		this.setLongTripPrice(longTripPrice);
		this.setLongTripDistance(longTripDistance);
		this.setBaseDistance(baseDistance);
	}

	public void farePrice() {
		int distance=this.getDistance();
		int tempDistance;
		int finalFare=0;
		
		if(distance>this.getLongTripDistance()) //Distance more than 75km
			finalFare=distance*this.getLongTripPrice();
		
		else {
			
			if(distance<=this.getBaseDistance()) //Distance less than or equal 5km
				finalFare=(distance*this.getBasePrice());
			
			else if(distance>this.getBaseDistance()){   //Distance greater than 5km
				tempDistance=distance-this.getBaseDistance();
				finalFare+=this.getBasePrice();  
				
				if(tempDistance<=this.getShortTripDistance()) 
					finalFare+=this.getShortTripPrice()*tempDistance;   //Price calculating for Next 15km
				
				else {
					tempDistance=tempDistance-this.getShortTripDistance();
					finalFare+=this.getShortTripPrice()*this.getShortTripDistance();
					finalFare+=this.getAdditionalChrge()*tempDistance;    //Price calculating for remaing distance
				}
				
			}
		}
		System.out.print("Sedan - Rs. "+finalFare+", ");
	}
}
