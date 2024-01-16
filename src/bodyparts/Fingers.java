package bodyparts;

import character.Entity;

import character.Worm;
import enums.WormCondition;

public class Fingers extends BodyPart {
    public Fingers(Entity owner) {
        super(owner);
    }
    public void feelWorm(Worm worm){
        worm.setCondition(WormCondition.COlD, WormCondition.STICKY);;
    }
}
