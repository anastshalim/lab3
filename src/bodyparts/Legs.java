package bodyparts;
import character.Entity;

public class Legs extends BodyPart {
    private int weight;
    public Legs(Entity owner) {
        super(owner);
    }

    public void weightlessness(){
        if (getWeight()> 0){
            getOwner().setHealth(0);
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
