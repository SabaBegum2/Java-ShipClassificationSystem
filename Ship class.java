/******************************************************************************

Name: Saba Begum
Access ID: HG7548
Date: 11/14/23

*******************************************************************************/
package ShipClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Ship {
    protected String name;
    protected String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nYear: " + year + "\n";
    }
}

class CruiseShip extends Ship implements Comparable<CruiseShip> {
    private int maximumNumberOfPassengers;

    public CruiseShip(String name, String year, int maximumNumberOfPassengers) {
        super(name, year);
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "Maximum Passengers: " + maximumNumberOfPassengers + "\n";
    }
    @Override
    
    /******************************************************************
     * Method Name: compareTo
     * Method Description:
     * This method is used to compare the current CruiseShip object 
     * with another CruiseShip object based on their maximum number 
     * of passengers.
     * Method Input Parameters: CruiseShip other - The CruiseShip 
     * object to be compared with.
     * Method Return Parameters: int - The value 0 if the argument 
     * Ship is equal to this Ship; a value less than 0 if this Ship is 
     * alphabeticaly less than the Ship argument; and a value 
     * greater than 0 if this Ship is alphabeticaly greater than 
     * the Ship argument.
     * 
     * Author Name: Saba Begum
     * Author Access ID: HG7548
     * Author Date: 11/14/23
     ******************************************************************/
    public int compareTo(CruiseShip other) {
        return Integer.compare(this.maximumNumberOfPassengers, other.maximumNumberOfPassengers);
    }
}

    class CargoShip extends Ship implements Comparable<CargoShip> {
    private int shipCapacity;

    public CargoShip(String name, String year, int shipCapacity) {
        super(name, year);
        this.shipCapacity = shipCapacity;
    }

    public int getShipCapacity() {
        return shipCapacity;
    }

    public void setShipCapacity(int shipCapacity) {
        this.shipCapacity = shipCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Ship Capacity: " + shipCapacity + "\n";
    }
    /***********************************************************
     * Method Name: compareTo
     * Method Description:
     * Determines the relative order of CargoShip objects for 
     * sorting purposes. It compares the shipCapacity of the 
     * current object with another CargoShip object.
     * Method Input Parameters: CargoShip other - The CargoShip 
     * object to be compared with.
     * Method Return Parameters: 
     * int - A negative integer if the current object is 
     * less than the argument object.
    A positive integer if the current object is greater than 
    the argument object.
    Zero if both objects are equal in terms of capacity.
     * Author Name: Saba Begum
     * Author Access ID: HG7548
     * Author Date: 11/14/23
     ***********************************************************/
    @Override
    public int compareTo(CargoShip other) {
        return Integer.compare(this.shipCapacity, other.shipCapacity);
    }
}

    class TankerShip extends Ship implements Comparable<TankerShip> {
    private String typeOfLiquid;
    private double capacity;

    public TankerShip(String name, String year, String typeOfLiquid, double capacity) {
        super(name, year);
        this.typeOfLiquid = typeOfLiquid;
        this.capacity = capacity;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid;
    }

    public void setTypeOfLiquid(String typeOfLiquid) {
        this.typeOfLiquid = typeOfLiquid;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Type of Liquid: " + typeOfLiquid + ", Capacity: " + capacity + "\n";
    }
    /****************************************************************
     * Method Name: compareTo
     * Method Description:
     * This is the TankerShip object to be compared with the current 
     * object. It represents another tanker ship whose typeOfLiquid 
     * property is to be compared against the current object.
     * Method Input Parameters: TankerShip other - The TankerShip 
     * object to be compared with.
     * Method Return Parameters: 
     * A negative integer if the current object's typeOfLiquid is 
     * alphabeticaly less than the argument object's typeOfLiquid.
    A positive integer if the current object's typeOfLiquid is 
    alphabeticaly greater than the argument object's typeOfLiquid.
    Zero if both objects have the same typeOfLiquid value, ignoring 
    case differences.int - 
     * 
     * Author Name: Saba Begum
     * Author Access ID: Hg7548
     * Author Date: 11/14/23
     ****************************************************************/
    @Override
    public int compareTo(TankerShip other) {
        return this.typeOfLiquid.compareToIgnoreCase(other.typeOfLiquid);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Ship disneyMagic = new CruiseShip("Disney Magic", "1998", 2400);
        Ship blackPearl = new CargoShip("Black Pearl", "1800", 50000);
        Ship lollipop = new TankerShip("Lollipop", "1960", "Oil", 500000.0);

        System.out.println(disneyMagic);
        System.out.println("-------------------------------");
        System.out.println(blackPearl);
        System.out.println("-------------------------------");
        System.out.println(lollipop);
        System.out.println("-------------------------------");

        List<CruiseShip> cruiseShips = new ArrayList<>();
        cruiseShips.add(new CruiseShip("Disney Magic1", "1998", 2400));
        cruiseShips.add(new CruiseShip("Disney Magic2", "2002", 2500));
        cruiseShips.add(new CruiseShip("Disney Magic3", "2011", 400));

        System.out.println("Before sorting three objects of CruiseShip:");
        for (CruiseShip ship : cruiseShips) {
            System.out.println(ship);
        }
        
        Collections.sort(cruiseShips);

        System.out.println("\nAfter sorting three objects of CruiseShip:");
        for (CruiseShip ship : cruiseShips) {
            System.out.println(ship);
        }

        System.out.println("\nProcess finished with exit code 0");
    }
}
