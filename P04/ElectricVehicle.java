public class ElectricVehicle extends Vehicle {
    public static double centsPerKwhOfElectricity;
    double whPerMile;
    double kwhInBattery;

    public  ElectricVehicle(int year,String make,String model,BodyStyle bodyStyle,double whPerMile,double kwhInBattery){
            super(year,make,model,bodyStyle);
            this.whPerMile=whPerMile;
            this.kwhInBattery=kwhInBattery;
    }

    @Override
    public double range() {
        
        return Math.round(kwhInBattery/(whPerMile/1000));
    }
    @Override
    public double fuelConsumed(double miles) {
        
        return miles*(whPerMile/1000);
    }
    @Override
    public double dollarsToTravel(double miles) {
        
        return Math.round((fuelConsumed(miles)*(centsPerKwhOfElectricity/100))*100)/100.0;
    }
   
}
