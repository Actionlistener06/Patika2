package Elevator;

import java.util.Random;

class Passenger {
    private int startingFloor;
    private int destinationFloor;

    public Passenger(int floors) {
        Random random = new Random();
        startingFloor = random.nextInt(floors) + 1;
        do {
            destinationFloor = random.nextInt(floors) + 1;
        } while (destinationFloor == startingFloor);
    }

    public int getStartingFloor() {
        return startingFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}