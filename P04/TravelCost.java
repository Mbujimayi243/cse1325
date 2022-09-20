import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the price per gallon of gas (dollars)? ");
        GasVehicle.dollarsPerGallonOfGas=sc.nextDouble();
        System.out.print("what is the price per KWH of electricity (cents)? ");
        ElectricVehicle.centsPerKwhOfElectricity=sc.nextDouble();
        System.out.print("How many miles is your trip? ");
        double miles=sc.nextDouble();
        System.out.println(miles);
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new ElectricVehicle(2022, "Tesla", "Model S plaid", BodyStyle.Sedan, 297, 100));
        vehicles.add(new ElectricVehicle(2022, "Tesla", "Model 3 LR", BodyStyle.Sedan, 242, 82));
        vehicles.add(new ElectricVehicle(2022, "GM", "Bolt", BodyStyle.Hatchback, 286, 66));
        vehicles.add(new ElectricVehicle(2022, "Nissan", "Leaf", BodyStyle.Hatchback, 269, 60));
        vehicles.add(new ElectricVehicle(2022, "Ford", "Mustang Mach-E", BodyStyle.SUV, 347, 88));
        vehicles.add(new ElectricVehicle(2022, "Ford", "F-150 Lightning", BodyStyle.Truck, 511, 131));
        vehicles.add(new ElectricVehicle(2022, "Ford", "F-150 Lightning", BodyStyle.Truck, 511, 131));
        vehicles.add(new ElectricVehicle(2022, "Ford", "F-150 Lightning", BodyStyle.Truck, 511, 131));
        vehicles.add(new GasVehicle(2022, "Ford", "F-150 ", BodyStyle.Truck, 25, 23));
        vehicles.add(new GasVehicle(2022, "Toyota", "Prius Hybrid", BodyStyle.Hatchback, 55, 11.4));
        vehicles.add(new GasVehicle(2022, "Toyota", "RAV4 ", BodyStyle.Crossover, 31, 14.5));
        vehicles.add(new GasVehicle(2022, "Nissan", "Rogue ", BodyStyle.Hatchback, 33, 14.5));
        Iterator itr = vehicles.iterator();
        for (int i=0;i<vehicles.size();i++)
        {
            Vehicle v=vehicles.get(i);
            System.out.println(v.dollarsToTravel(miles)+" "+v.range()+" "+v.toString());
        }

    }
    
    
}
