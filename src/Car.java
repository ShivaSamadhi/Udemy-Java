package src;

//FIELDS (VARIABLES) WITHIN A CLASS ARE OFTEN CREATED USING THE PRIVATE ACC-MOD. THIS IS PART OF ENCAPSULATION, A CORE PRINCIPLE OF OOP.
// PRIVATE ACCESS MEANS THAT THE FIELD (OR METHOD) CAN ONLY BE ACCESS FROM WITHIN THE CLASS THAT IT IS DEFINED WITHIN. I CALL THIS 'INTERNAL INVISIBILITY' BECAUSE THE FIELD/METHOD CANNOT BE SEEN OR COMMUNICATED WITH BY ANY EXTERNAL CLASSES

import java.util.Locale;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private String model;
    private String engine;
    private String color;

    public Car(String name, String size, int doors, int wheels, int gears, boolean isManual, String model, String engine, String color) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.printf("%nGear changed to %s gear. Car.changeGear().%n", currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.printf("Velocity: %s. Direction: %sº. Car.changeVelocity().%n", speed, direction);
    }



    public void setModel(String model){
        String validModel = model.toLowerCase();
    }
    //HERE WE ARE CREATING A PUBLIC METHOD BY WHICH WE CAN UPDATE THE MODEL OF OUR CAR OBJ FROM AN EXTERNAL CLASS. 'VOID' IS THE RETURN TYPE AN MEANS THAT OUR METHOD WILL NOT RETURN ANY DATA.
    //METHODS ARE BROKEN INTO 2 TYPES: GET & SET. SO WHEN WE TYPE IN 'SET' AS PART OF THE METHOD NAME, INTELLIJ WILL AUTOCOMPLETE IT BASED ON THE NAMES OF FIELDS THAT HAVE ALREADY BEEN DEFINED WITHIN THIS PARTICULAR CLASS => 'setModel'/'setEngine'
    //THE PARAMETER FOR THIS METHOD IS A STRING ALSO NAMED 'MODEL'. IN ORDER TO DIFFERENTIATE BETWEEN THE FIELD NAMED 'MODEL' THAT IS ASSOCIATED WITH THE CAR OBJ, AND THE PARAMETER NAMED 'MODEL' ASSOCIATED WITH THIS PARTICULAR METHOD, WE USE THE 'THIS' KEYWORD WHICH REFERS TO THE FIELD!
    //WE REFACTORED THE IMPLEMENTATION OF THIS METHOD TO INCLUDE A FORM OF STATE VALIDATION. THIS PRACTICE STOPS US FROM ACCEPTING INVALID OR INCOMPATIBLE DATA BY SETTING UP THE RULES FOR THAT OBJECT WITHIN ITS IMPLEMENTATION.

    public String getModel(){
        return this.model;
    }
    //HERE WE ARE GETTING INFORMATION BACK FROM THE CAR CLASS ABOUT OUR CAR OBJ BY CREATING A PUBLIC METHOD THAT RETURNS A STRING WITH THE NAME OF THE CAR'S MODEL

}
