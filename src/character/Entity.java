package character;

import bodyparts.Hold;
import object.Item;
import object.Location;

public class Entity implements Hold{
    private int health;
    private Location location;
    private String name;

    public Entity(int health, Location location, String name) {
        this.health = health;
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        location.addEntity(this);
    }
    @Override
    public void holdObject(Item object) {
        object.setOwner(this);
    }


    @Override
    public String toString() {
        return name;
    }


}
