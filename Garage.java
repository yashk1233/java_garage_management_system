package ca2;
import java.util.*;



class Services{
	Scanner sc = new Scanner(System.in);

	
	public void get_services() {
		
		System.out.println("\t  1.>> Full Vehicle Servicing");
		System.out.println("\t  2.>> Wash Vehicle");
		System.out.println("\t  3.>> Sell Your Vehicle");
		System.out.println("\t  4.>> Repair Your Vehicle");
		
	}
	
	public void full_service(String type,int cost) {
		System.out.println("You Have Selected Full Vehicle Servicing  ");
		System.out.println("Your Vehicle Type : "+type);
		System.out.println("FUll Servicing Charge : ₹"+cost);
		
		System.out.println();
		System.out.println("Please Confirm Your Order ");
		System.out.print("Enter The Advance Amount You Want To Pay : ");
		int amount = sc.nextInt();
		System.out.println("Balace Amount Remaining : "+(cost-amount));
		System.out.println("Thank-You Your Order has Confirmed");
		
		
	}
	
	public void wash(String type,int cost) {
		System.out.println("You Have Selected Wash Vehicle Service ");
		System.out.println("Your Vehicle Type : "+type);
		System.out.println("Wash Vehicle Charge : ₹"+cost);
		
		System.out.println();
		System.out.println("Please Confirm Your Order ");
		System.out.print("Enter The Advance Amount You Want To Pay : ");
		int amount1 = sc.nextInt();
		System.out.println("Balace Amount Remaining : "+(cost-amount1));
		System.out.println("Thank-You Your Order has Confirmed");
		
	}
	
	public void sell(String type) {
		System.out.println("You Have Selected Sell Vehicle Service ");
		System.out.println("Your Vehicle Type : "+type);
		System.out.println();
		System.out.print("Enter the Model Of Your Vehicle : ");
		String Model= sc.nextLine();
		System.out.print("Enter the Amount You Want For Your Vehicle : ");
		int sellAMount=sc.nextInt();
		
		System.out.println();
		
		System.out.println("Thank-You We Will Contact You Soon :) ");
		
	}
	
	public void repair(String type,int cost) {
		System.out.println("You Have Selected Reapir Vehicle Service ");
		System.out.println("Your Vehicle Type : "+type);
		System.out.println("Repair Vehicle Charge : ₹"+cost);
		
		System.out.println();
		System.out.println("Please Confirm Your Order ");
		System.out.print("Enter The Advance Amount You Want To Pay : ");
		int amount1 = sc.nextInt();
		System.out.println("Balace Amount Remaining : "+(cost-amount1));
		System.out.println("Thank-You Your Order has Confirmed");
		
	}
	
	
}

class Vehicle extends Services{
	Scanner sc = new Scanner(System.in);
	public void TwoWheeler() {
		String type="2 Wheeler";
		int full_service=4500;
		int wash=500;
		int repair=2000;
		System.out.println("You have selected 2 Wheelwe Vehicle type");
		System.out.println();
		System.out.println("Please Select The Services You Are Looking For ::");
		System.out.println();
		this.get_services();
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			this.full_service(type,full_service);
			break;
		case 2:
			this.wash(type,wash);
			break;
		case 3:
			this.sell(type);
			break;
		case 4:
			this.repair(type,repair);
			break;
		
			
		}
		
		

		
	}
	
	public void ThreeWheeler() {
		String type="3 Wheeler";
		int full_service=5000;
		int wash=500;
		int repair=4000;
		System.out.println("You have selected 3 Wheelwe Vehicle type");
		System.out.println();
		System.out.println("Please Select The Services You Are Looking For ::");
		System.out.println();
		this.get_services();
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			this.full_service(type,full_service);
			break;
		case 2:
			this.wash(type,wash);
			break;
		case 3:
			this.sell(type);
			break;
		case 4:
			this.repair(type,repair);
			break;
		
	}
	}
	
	
	public void FourWheeler() {
		String type="4 Wheeler";
		int full_service=8000;
		int wash=1000;
		int repair=4000;
		System.out.println("You have selected 4 Wheelwe Vehicle type");
		System.out.println();
		System.out.println("Please Select The Services You Are Looking For ::");
		System.out.println();
		this.get_services();
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			this.full_service(type,full_service);
			break;
		case 2:
			this.wash(type,wash);
			break;
		case 3:
			this.sell(type);
			break;
		case 4:
			this.repair(type,repair);
			break;
		
	}
		
	}
	
}
public class Garage  {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Vehicle myg= new Vehicle();
		System.out.println("********GARAGE SHOP MANAGEMENT SYSTEM*******");
		System.out.println();
		System.out.println("\t   Select your vehicle type");
		System.out.println();
		System.out.println("\t\t>>> 2 wheeler ");
		System.out.println("\t\t>>> 3 wheeler ");
		System.out.println("\t\t>>> 4 wheeler ");
		int select = sc.nextInt();
		
		switch(select){
		case 2:
			myg.TwoWheeler();
			break;
		case 3:
			myg.ThreeWheeler();
			break;
		case 4:
			myg.FourWheeler();
			break;
		default:
			
			System.out.print("wrong input");
		}
		
		
		
	}
	
}
