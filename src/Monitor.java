package src;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    //THE RESOLUTION CLASS IS PART OF THE MONITOR CLASS, BUT INSTEAD OF HAVING THE 'IS A' RELATIONSHIP, THEY SHARE THE 'HAS A' RELATIONSHIP. MEANING 'A MONITOR *HAS A* RESOLUTION'.
    //THIS IS THE MAIN DIFFERENCE BETWEEN COMPOSITION AND INHERITANCE. COMPOSITION LITERALLY SPEAKS TO FIELDS AND METHODS THAT MAKE UP AN INDIVIDUAL OBJECT. A MONITOR IS A VISUAL DISPLAY, BUT RESOLUTION IS NOT A MONITOR, ITS A QUALITY THAT A MONITOR HAS.

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.printf("Drawing pixel at (%s,%s) in %s", x, y , color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
}
