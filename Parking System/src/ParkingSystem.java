
public class ParkingSystem {

	public static void main(String[] args) {
		int floorsno=7;
		int slotsnoperfloor=6;
		 ParkingLot parkingLot = new ParkingLot("PR1234", floorsno, slotsnoperfloor);

	        System.out.println("No of open slots for car: " + parkingLot.getNoOfOpenSlots("car"));

	        String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
	        String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");
	        System.out.println("After parking:");
	        parkingLot.displayOccupiedSlots("car");

	        parkingLot.unPark(ticket2);
	        parkingLot.displayOccupiedSlots("car");

	        parkingLot.displayOpenSlots("truck");
	        parkingLot.parkVehicle("truck", "MH-01", "black");
	        
	        System.out.println();
	        parkingLot.parkVehicle("truck", "MH-01-4532", "black");
	        parkingLot.parkVehicle("truck", "MH-01-912", "black");
	        parkingLot.parkVehicle("truck", "MH-01-0911", "black");
	        parkingLot.parkVehicle("truck", "MH-01-0913", "black");
	        parkingLot.parkVehicle("truck", "MH-01-0914", "black");
	        parkingLot.parkVehicle("truck", "MH-01-0915", "black");
	     
	        System.out.println("After parking three more trucks:");

	        parkingLot.parkVehicle("truck", "MH-01-723", "black");

	        
	        
	    }

	}


