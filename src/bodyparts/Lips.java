package bodyparts;

import character.Entity;

public class Lips extends BodyPart{

    public Lips(Entity owner) {
        super(owner);
    }
    public void bite(){
        owner.setHealth(65);
    }
}
