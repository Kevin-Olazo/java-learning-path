package com.ciberedu.week09_GenericsOptionals.day01_generic_classes;

public class VehicleGarage {

    private Container<Vehicle> vehicles = new Container<>();

    public void park(Vehicle car){
        this.vehicles.add(car);
    }

    public Vehicle retrieve(){
        if (vehicles.isEmpty()){
            return null;
        }
        Vehicle v = this.vehicles.get();
        vehicles.clear();
        return v;
    }

}
