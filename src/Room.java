package src;

public class Room {
    private Area area;
    private Walls walls;
    private Furniture furniture;

    public Room(Area area, Walls walls, Furniture furniture) {
        this.area = area;
        this.walls = walls;
        this.furniture = furniture;
    }
    public void countWalls(){
        System.out.printf("There are %s walls", walls.getWalls());
    }
}
