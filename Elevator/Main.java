package Elevator;

public class Main {
    public static void main(String[] args) {
        int floors = 12;
        int elevatorsPerBank = 5;

        Building building = new Building(floors, elevatorsPerBank);
        building.runSimulation();
    }
}

