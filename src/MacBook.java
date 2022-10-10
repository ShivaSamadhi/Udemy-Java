package src;

public class MacBook extends PC {
    private String processor;
    private String model;
    private int year;
    private int generation;
    private boolean hasAppleCare;

    public MacBook(Case theCase, Monitor monitor, Motherboard motherboard, String processor, String model, int year, int generation, boolean hasAppleCare) {
        super(theCase, monitor, motherboard);
        this.processor = processor;
        this.model = model;
        this.year = year;
        this.generation = generation;
        this.hasAppleCare = hasAppleCare;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public boolean isHasAppleCare() {
        return hasAppleCare;
    }

    public void setHasAppleCare(boolean hasAppleCare) {
        this.hasAppleCare = hasAppleCare;
    }
}
