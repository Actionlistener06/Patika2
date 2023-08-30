package Elevator;

import java.util.ArrayList;

class Elevator {
    private int currentFloor;
    private Direction direction;
    private boolean doorsOpen;
    private ArrayList<Passenger> passengers;

    public Elevator() {
        this.currentFloor = 1;
        this.direction = Direction.UP;
        this.doorsOpen = false;
        this.passengers = new ArrayList<>();
    }

    public void move(Direction direction, int floor) {
        this.direction = direction;
        System.out.println("Elevator is moving " + direction + " to floor " + floor);
        currentFloor = floor;
        openDoors();
    }

    public void openDoors() {
        System.out.println("Elevator doors are opening at floor " + currentFloor);
        doorsOpen = true;
        passengers.forEach(passenger -> {
            if (passenger.getDestinationFloor() == currentFloor) {
                passengers.remove(passenger);
                System.out.println("Passenger exits elevator at floor " + currentFloor);
            }
        });
        closeDoors();
    }

    public void closeDoors() {
        System.out.println("Elevator doors are closing at floor " + currentFloor);
        doorsOpen = false;
    }
}