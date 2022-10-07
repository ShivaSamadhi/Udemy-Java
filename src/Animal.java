package src;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    //SIMILAR TO PREVIOUS EXAMPLES, PRIVATE FIELDS ARE CREATED WITHIN THE ANIMAL CLASS. THE FIELDS THAT ARE DEFINED HERE ARE SUPPOSED TO REPRESENT ATTR THAT ARE COMMON TO ALL ANIMALS AND CAN EASILY BE INHERITED BY MORE SPECIFIC SUBCLASSES.

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    //THIS CONSTRUCTOR WAS AUTOMATICALLY GENERATED USING THE CMD+N KEYBINDING. IT CONTAINS ALL THE APPROPRIATE FIELDS AND PARAMETERS.

    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void move(int speed){
        System.out.printf("Animal.move() called. Animal moving at %s", speed);
    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
    //ALL GETTERS WERE AUTOMATICALLY GENERATED WITH THE CMD+N KEYBINDING
}
