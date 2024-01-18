package object;

import character.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {
    private final String name;
    private final ArrayList<Entity> entities = new ArrayList<>();
    private final ArrayList<Item> items = new ArrayList<>();

    public Location(String name) {
        this.name = name;
    }

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

    public List<Item> getItems() {
        return this.items;
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
    public String getLocation() {
        return name;
    }


    @Override
    public String toString () {
        return name;
    }
}