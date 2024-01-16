package bodyparts;
import character.Entity;
import object.Location;

public class Legs extends BodyPart {
    private int weight;
    public Legs(Entity owner) {
        super(owner);
    }

    public void explore(Location location){
        location.removeEntity(owner);
        if (getWeight()> 0){
            owner.setHealth(0);
        }
        else{
            setWeight(10);
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
