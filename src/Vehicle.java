package src;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }
    public void steer (int direction) {
        this.currentDirection = direction;

        System.out.printf("Steering at %sº. Vehicle.steer().%n", currentDirection);
    }
    public void move (int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.printf("%s moving at %s mph at %sº. Vehicle.move().%n",getName(), currentVelocity, currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
