public class GasVehicle extends Vehicle {
    public static double dollarsPerGallonOfGas;
    double milesPerGallon;
    double gallonsInTank;
    public GasVehicle(int year,String make,String model,BodyStyle bodyStyle,double milesPerGallon,double gallonsInTank)
    {
        super(year,make,model,bodyStyle);
        this.milesPerGallon=milesPerGallon;
        this.gallonsInTank=gallonsInTank;
    }
    @Override
    public double range() {
        
        return Math.round(gallonsInTank*milesPerGallon);
    }
    @Override
    public double fuelConsumed(double miles) {
        
        return miles/milesPerGallon;
    }
    @Override
    public double dollarsToTravel(double miles) {
        
        return Math.round((fuelConsumed(miles)*dollarsPerGallonOfGas)*100)/100.0;
    }
    
}
