package src;

public class Furniture {

    private String name;
    private int quantity;
    private boolean isBroken;

    public Furniture(String name, int quantity, boolean isBroken) {
        this.name = name;
        this.quantity = quantity;
        this.isBroken = isBroken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
