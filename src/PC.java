package src;
//HERE WE ARE GOING TO CREATE THE PC CLASS TO STORE THE MONITOR, CASE, AND MOTHERBOARD CLASSES VIA COMPOSITION.
//NOTE THAT THE EXTENDS KEYWORD WAS NOT USED.

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    //HERE WE INITIALIZE EACH CLASS AS A FIELD WITHIN OUR PC CLASS THEN CREATE THE NECESSARY CONSTRUCTOR AND GETTERS

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
//COMPOSITION HIGHLIGHTS ONE OF THE DRAWBACKS OF STANDARD INHERITANCE, WHICH IS THAT WE CAN ONLY INHERIT FROM ONE CLASS AT A TIME (GREAT WHITE EXTENDS SHARK EXTENDS FISH EXTENDS ANIMAL).
// COMPOSITION ALLOWS US TO CONNECT MULTIPLE CLASSES INTO ONE OVERALL OBJECT (A PC IS COMPRISED OF A MONITOR, MOTHERBOARD, AND CASE)