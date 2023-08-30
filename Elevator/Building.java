package Elevator;

import java.util.Random;

class Building {
    private int floors;
    private int elevatorsPerBank;
    private ElevatorBank elevatorBank;

    public Building(int floors, int elevatorsPerBank) {
        this.floors = floors;
        this.elevatorsPerBank = elevatorsPerBank;
        this.elevatorBank = new ElevatorBank(elevatorsPerBank);
    }

    public void runSimulation() {
        for (int i = 0; i < 100; i++) {
            int startingFloor = new Random().nextInt(floors) + 1;
            int destinationFloor;
            do {
                destinationFloor = new Random().nextInt(floors) + 1;
            } while (destinationFloor == startingFloor);

            Direction direction = (startingFloor < destinationFloor) ? Direction.UP : Direction.DOWN;
            elevatorBank.callElevator(direction, startingFloor);
        }
    }
}