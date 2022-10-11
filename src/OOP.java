package src;

import src.Vehicle.TLX;

import java.util.Scanner;

public class OOP {
    //ENCAPSULATION
    //ABSTRACTION
    //INHERITANCE
    //POLYMORPHISM

    //OBJECTS STORE THEIR STATES IN FIELDS (AKA VARIABLES) & EXPOSE THEIR BEHAVIORS VIA METHODS (AKA FUNCTIONS)

    //CLASSES ARE SIMPLY TEMPLATES OR BLUEPRINTS FOR THE CREATION OF NEW OBJECTS
    //BY DEFAULT THIS MEANS THAT OBJECTS ARE JUST INSTANCES OF A CLASS THAT ARE BUILT BASED ON THE ORIGINAL TEMPLATE

    //ArrayLists
    private static Scanner listScanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        //Car mercedes = new Car();

        //HERE WE CREATE A NEW INSTANCE OF THE CAR CLASS UNDER THE NAME MERCEDES.
        // THE FIRST 'CAR' REFERS TO THE CLASS WHICH IS JUST A TEMPLATE, THE SECOND 'CAR()' IS THE ACTUAL OBJ
        //ONCE THE NEW OBJ IS CREATED IT AUTOMATICALLY INHERITS METHODS FROM JAVA. THIS IS ANOTHER KEY ASPECT OF OOP CALLED INHERITANCE.
        //THESE METHODS CAN BE ACCESSED USING DOT NOTATION. IT IS KEY TO NOTE THAT THE FIELDS WE INITIALIZED IN THE CAR CLASS THAT WERE SET TO PRIVATE WILL NOT SHOW UP AS INHERITED FIELDS/METHODS

        //mercedes.model = "G Wagon";

        //ONCE WE SWITCHED THE ACC-MOD OF MODEL TO PUBLIC, IT CAN BE UTILIZED TO MODIFY ATTRIBUTES OF OUR MERCEDES CAR OBJ
        //THIS EXAMPLE ISNT PERFECT THO BECAUSE IT VIOLATES THE RULES OF ENCAPSULATION. IT WOULD BE BEST PRACTICE TO LEAVE ALL FIELDS PRIVATE AND CREATE PUBLIC GETTER/SETTER METHODS THAT THE OOP CLASS COULD USE TO INDIRECTLY INTERFACE WITH THE CAR CLASS

        //mercedes.setModel("G-Wagon");
        //HERE WE ARE CALLING THE PUBLIC METHOD 'setModel' TO SET THE MODEL NAME FOR THIS INSTANCE OF THE CAR CLASS.
        //HOW THIS METHOD IS ACTUALLY IMPLEMENTED WITHIN THE CAR CLASS IS HIDDEN AND ULTIMATELY NOT IMPORTANT, AS LONG AS WE HAVE A WAY IN WHICH TO INDIRECTLY INTERFACE WITH WHATEVER INFO WE WANT TO RECEIVE OR MUTATE. THIS IS ANOTHER CORE PRINCIPLE OF OOP CALLED ABSTRACTION

        //System.out.printf("Model is %s%n", mercedes.getModel());
        //HERE WE ARE CALLING THE PUBLIC METHOD 'getModel' TO GET THE MODEL NAME FOR THIS INSTANCE OF THE CAR CLASS. THEN WE PRINTING THAT INFO INTO THE TERMINAL AS A FORMATTED STRING
        //AGAIN, THEY WAY THIS IS BEING IMPLEMENTED IN THE BACKGROUND IS NOT RELEVANT. THE ONLY RELEVANT ASPECT IS THAT WE HAVE A WAY TO GET THAT INFO BACK TO US

        //BANK ACCOUNT CLASS EXERCISES
        BankAccount chase = new BankAccount();

        chase.setAccountNumber("123456789");
        System.out.println(chase.getAccountNumber());

        chase.setBalance(10000.01);
        System.out.printf("Current balance: $%s%n",chase.getBalance());

        chase.depositFunds(5000.05);
        System.out.printf("Current balance: $%s%n",chase.getBalance());
        chase.withdrawFunds(5000.05);
        System.out.printf("Current balance: $%s%n",chase.getBalance());

        chase.setCustomerName("Ramaj Johnson");
        System.out.printf("Account Holder: %s%n", chase.getCustomerName());

        chase.setEmail("rjohnson3795@gmail.com");
        System.out.printf("Email: %s%n", chase.getEmail());

        chase.setPhoneNumber("4693891347");
        System.out.printf("Phone Number: %s%n", chase.getPhoneNumber());

        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("Anpu", 5, 5, 2,4, 1, 32, "silky black");
        dog.eat();
        //BECAUSE THE EAT METHOD IS A PUBLIC METHOD CREATED WITHIN THE ANIMAL SUPER-CLASS, IT CAN BE INHERITED AND USED BY THE DOG SUBCLASS
        dog.walk();
        dog.run();

        TLX tlx = new TLX();
        tlx.accelerate(50);
        tlx.steer(55);
        tlx.accelerate(50);
        tlx.changeVelocity(10, 60);

       Dimensions dimension = new Dimensions(20, 20, 5);
       Case theCase = new Case("A137", "Apple", "Battery", dimension);

       Monitor monitor = new Monitor("Retina Display", "Apple", 15, new Resolution(2160, 3840));

       Motherboard motherboard = new Motherboard("M2", "Apple", 4, 4, "blah");
       //FIRST WE CREATE ALL OF THE SUBCLASSES OF OUR COMPOSITION SO THAT ALL OF THE NECESSARY PARAMETERS CAN BE FILLED IN WHEN WE CREATE THE NEW INSTANCE OF OUR MACBOOK PC

       MacBook macBook = new MacBook(theCase, monitor, motherboard, "M2", "Pro", 2021, 9, true);
       //NEXT WE CAN CREATE THE NEW INSTANCE OF OUR MACBOOK AND PASS IN THE APPROPRIATE INFORMATION
       // macBook.getMonitor().drawPixelAt(5,6,"Gold");
        //USING METHOD CHAINING WE CAN ACCESS THE drawPixelAt() METHOD BY USING THE getMonitor() METHOD THAT WAS INHERITED BY THE MACBOOK CLASS FROM THE PC CLASS
        //macBook.getTheCase().pressPowerBtn();
        macBook.powerUp();

        Room livingRoom = new Room(new Area(20, 30), new Walls(7), new Furniture("Couch", 2, false));
        livingRoom.countWalls();

        //ArrayLists
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = listScanner.nextInt();
            listScanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }
}
