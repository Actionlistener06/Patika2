package Elevator;

import java.util.Random;

class ElevatorBank {
    private Elevator[] elevators;

    public ElevatorBank(int elevatorsPerBank) {
        elevators = new Elevator[elevatorsPerBank];
        for (int i = 0; i < elevatorsPerBank; i++) {
            elevators[i] = new Elevator();
        }
    }

    public void callElevator(Direction direction, int floor) {
        Elevator selectedElevator = elevators[new Random().nextInt(elevators.length)];
        selectedElevator.move(direction, floor);
    }
}