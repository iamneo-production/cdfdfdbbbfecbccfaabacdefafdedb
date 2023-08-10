package model;

import java.time.LocalDate;

public class Bus{
	private int id;
    private String model;
    private int capacity;
    private LocalDate manufacturingDate;

    public Bus(int id, String model, int capacity, LocalDate manufacturingDate) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
        this.manufacturingDate = manufacturingDate;
    }
}
	
