package bodyparts;

import character.Entity;

abstract public class BodyPart {
    protected Entity owner;
    public BodyPart(Entity owner) {
        this.owner = owner;
    }


}
