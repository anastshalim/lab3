package character;

import bodyparts.*;
import enums.*;
import object.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Luis extends Entity implements Hold{
    protected Location location;
    private String name;
    protected ArrayList<Emotion> emotion = new ArrayList<>();
    public Fingers fingers= new Fingers(this);
    protected Lips lips = new Lips(this);

    protected Item thought;
    protected Item object;

    public Luis(int health, Location loc, String name) {
        super(health, loc, name);
    }

    public void setTypes(Emotion... emotion) {
        this.emotion.addAll(Arrays.asList(emotion));
    }
    public boolean hasType(Emotion emotion) {
        return this.emotion.contains(emotion);
    }
    public void remember(Item item){
        this.thought = item;
        if (item.getClass()==Coffin.class){
            Coffin clone = (Coffin)item;
            clone.addCondition(CoffinCondition.CLEAN, CoffinCondition.WHITE, CoffinCondition.WHITE);
            this.thought=clone;
        }
    }
    public void feelPain(){
        lips.bite();
        this.setTypes(Emotion.FEROCIOUS);

    }
    public void see(Coffin coffin){
        if (!coffin.getStove().getRaise()){
            coffin.getStove().openCoffin();
        }

    }
    public void dig(Shovel shovel){
        if (this.hasType(Emotion.FEROCIOUS)){
            shovel.setDamage(50);
            this.setHealth(50);
            this.setTypes(Emotion.LONELY,Emotion.ALIEN);
        } else {
            shovel.setDamage(50);
            this.setHealth(20);

        }

    }
    public void feel(Worm worm){
        worm.setCondition(WormCondition.COlD,WormCondition.STICKY);
        this.setHealth(10);
        this.setTypes(Emotion.DISGUST);
        worm.getout(this.getLocation());
        fingers.feelWorm(worm);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != object.hashCode()) return false;
        Entity person = (Entity) obj;
        return person.getName().equals(this.name) && person.getHealth() == this.getHealth();


    }
    @Override
    public int hashCode(){
        return Objects.hash(name, getHealth(), getLocation());
    }
    @Override
    public void holdObject(Item object) {
        this.object=object;
        this.object.setOwner(this);
    }
    @Override
    public String toString(){
        return name;
    }

}




