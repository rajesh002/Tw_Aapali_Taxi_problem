package Controller;

import java.util.Scanner;

import dao.Mini;
import dao.SUV;
import dao.Sedan;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		Mini mini = new Mini(distance);
		mini.farePrice();
		Sedan sedan = new Sedan(distance);
		sedan.farePrice();
		SUV suv = new SUV(distance);
		suv.farePrice();
		sc.close();
	}

}


// TestCase-1
//Input:10
//Output:Mini-Rs.120,Sedan-Rs.140,SUV-Rs.175

//TestCase-2
//Input:20
//Output:Mini-Rs.216,Sedan-Rs.260,SUV-Rs.325

//TestCase-3
//Input:120
//Output:Mini-Rs.960,Sedan-Rs.1200,SUV-Rs.1525