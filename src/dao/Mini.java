package dao;

import daoInterface.TaxiInterface;
import model.Taxi;

public class Mini extends Taxi implements TaxiInterface{
	int basePrice=50;
	int baseDistance=3;
	int shortTripPrice=10;
	int additionalChrge=8;
	int longTripPrice=8;
	int longTripDistance=75;
	public Mini(int distance){
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
		
		if(distance>this.getLongTripDistance())   //Distance more than 75km
			finalFare=distance*this.getLongTripPrice();
		
		else {
			
			if(distance<=this.getBaseDistance())  //Distance less than or equal 3km
				finalFare=(distance*this.getBasePrice());
			
			else if(distance>this.getBaseDistance()){   //Distance greater than 3km
				tempDistance=distance-this.getBaseDistance();            
				finalFare+=this.getBasePrice();              //Price calculating for Next 15km
				
				if(tempDistance<=this.getShortTripDistance())  
					finalFare+=this.getShortTripPrice()*tempDistance;    //Price calculating for remaing distance
				
				else {
					tempDistance=tempDistance-this.getShortTripDistance();
					finalFare+=this.getShortTripPrice()*this.getShortTripDistance();
					finalFare+=this.getAdditionalChrge()*tempDistance;
				}
				
			}
		}
		System.out.print("Mini - Rs. "+finalFare+", ");
	}
}
