package src;

//IN ORDER TO INHERIT FIELDS/METHODS FROM THE ANIMAL CLASS INTO THE DOG SUBCLASS, WE USE THE 'EXTENDS' KEYWORD AND REFERENCE THE ANIMAL CLASS RIGHT AFTER
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //ALTHOUGH PRIVATE FIELDS HAVE BEEN INHERITED FROM THE ANIMAL SUPERCLASS, THE PRIVATE FIELDS ABOVE REPRESENT ATTR THAT ARE SPECIFIC TO THE DOG SUBCLASS AND MAY NOT BE VALID IN OTHER SUBCLASSES OF ANIMALS


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }
    //THIS CONSTRUCTOR WAS AUTOMATICALLY GENERATED USING THE CMD+N KEYBINDING. AS WE CAN SEE, ALL THE APPROPRIATE FIELDS ARE PASSED AS PARAMETERS. 'SUPER' REFERS TO THE ANIMAL SUPER-CLASS WHERE THESE FIELDS ARE BEING INHERITED FROM.
    //NOW THAT WE HAVE THE BASIC LAYOUT OF THE CONSTRUCTOR, WE CAN BEGIN TO CUSTOMIZE IT TO THE SPECIFIC REQUIREMENTS OF THE DOG SUBCLASS.
    //IN THIS EXAMPLE, SINCE ALL DOGS HAVE A BRAIN AND A BODY, WE CAN REMOVE THOSE PARAMETERS AND CHANGE THEIR CORRESPONDING FIELD VALUE TO 1. NEXT WE CAN ADD OUR DOG SPECIFIC ATTR TO THE PARAMETERS OF THE CLASS AS WELL AS TO THE BODY USING THE 'THIS' KEYWORD.
    //NOW ALL THE FIELDS OF THE DOG CLASS HAVE BEEN PROPERLY INITIALIZED. NEXT WE CAN TEST THE DOG CLASS BY CONSTRUCTING IT IN OUR OOP.JAVA FILE

    private void chew(){
        System.out.println("Dog.chew() called");
    }
    //THIS IS A PRIVATE METHOD UNIQUE TO THE DOG SUBCLASS

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    //THIS IS A METHOD OVERRIDE CALL THAT ALLOWS US TO BRING THE EAT METHOD FROM THE ANIMAL SUPER-CLASS INTO THE DOG SUBCLASS. WHEN RUNNING THE CODE, THE SUPER.EAT REFERS TO THE EAT METHOD IN THE ANIMAL CLASS, WHILE A CALL OF DOG.EAT WOULD REFER DIRECTLY TO THE OVERRIDE METHOD WHICH REPRESENTS THE CLOSEST VERSION OF THE METHOD
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
        //REFERS DIRECTLY TO THE MOVE METHOD IN THE ANIMAL SUPER-CLASS
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
        //REFERS TO THE MOVE METHOD OVERRIDE CREATED BELOW SPECIFICALLY FOR THE DOG SUBCLASS
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called from the Dog.run() method");
        super.move(speed);
    }
}
