package bodyparts;

import character.Entity;

abstract public class BodyPart {
    private final Entity owner;

    public BodyPart(Entity owner) {
        this.owner = owner;
    }


    public Entity getOwner() {
        return owner;
    }
}
