package src;

public class Room {
    private Area area;
    private Walls walls;
    private Furniture furniture;

    public Room(Area squareFeet, Walls walls, Furniture furniture) {
        this.squareFeet = squareFeet;
        this.walls = walls;
        this.furniture = furniture;
    }
}
