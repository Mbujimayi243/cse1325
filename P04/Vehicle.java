public abstract class Vehicle {
    int year;
    String make;
    String model;
    BodyStyle bodyStyle;
    public Vehicle(int year,String make,String model,BodyStyle bodyStyle){
        this.year=year;
        this.make=make;
        this.model=model;
        this.bodyStyle=bodyStyle;
    }
    public abstract double range();
    public abstract double fuelConsumed(double miles);
    public abstract double dollarsToTravel(double miles);
    public String toString()
    {
        return this.year+" "+this.make+" "+this.model+" "+this.bodyStyle;
    }
}
