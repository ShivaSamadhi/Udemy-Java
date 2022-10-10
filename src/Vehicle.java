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

        System.out.printf("Steering at %sº. Vehicle.steer().", currentDirection);
    }
    public void move (int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.printf("Moving at %s mph at %s. Vehicle.move().", currentVelocity, currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
    }
}
