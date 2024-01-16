package bodyparts;

import character.Entity;
import object.Item;
import object.Lantern;

public class Armpit extends BodyPart implements Hold {
    protected Lantern lantern;
    public Armpit(Entity owner) {
        super(owner);
    }

    @Override
    public void holdObject(Item item) {
           this.lantern.setOwner(owner);

    }
}
