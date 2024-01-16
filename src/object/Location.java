package object;

import character.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Location {


    private final String name;

    public Location(String name) {
        this.name = name;
    }

    private ArrayList<Entity> entities = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();


    public void setEntity(Entity... people) {
        this.entities.addAll(Arrays.asList(people));
        for (Entity entity : people) {
            entity.setLocation(this);
        }
    }

    public Entity[] getEntity() {
        Entity[] entities = new Entity[this.entities.size()];
        return this.entities.toArray(entities);
    }

    public void removeEntity(Entity... entities) {
        for (Entity entity : entities) {
            this.entities.remove(entity);
        }
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    protected void addItem(Item item) {
        this.items.add(item);
    }

    public void setItems(Item... items) {
        this.items.addAll(Arrays.asList(items));
        for (Item item : items) {
            item.setLocation(this);
        }
    }
    public String getLocation () {
        return name;
    }

    public void setLocation(ArrayList<Entity> entities) {
        this.entities = entities;
    }

    @Override
    public String toString () {
        return name;
    }
}