package services;

public class Booking{

    public double booking(int numberOfPersons, double pricePerPerson) {
        if (numberOfPersons <= 0 || pricePerPerson <= 0) {
            throw new IllegalArgumentException("Number of persons and price per person must be positive.");
        }
        return numberOfPersons * pricePerPerson;
    }
    
}

