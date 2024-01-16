package object;

import bodyparts.Armpit;
import character.Luis;
import enums.Material;

public class Lantern extends Item{
    private boolean lights = false;
    private Luis owner;
    public Lantern( int damage, Location location, Material material) {
        super(damage, location, material);
    }
    public boolean getLights(){
        return lights;
    }
    public void setLights(boolean lights){
        this.lights=lights;
    }

    public void setOwner(Luis owner) {
        this.owner = owner;
    }
    public Luis getOwner() {
        return owner;
    }
    public void ON() {
        setLights(true);

        if (getLights()) {
            System.out.println("Фонарик включён");
            this.getOwner().holdObject(this);
        }
    }


    public void OFF() {
        this.lights = false;
        this.getOwner().holdObject(this);
        System.out.println(this.toString() + " держит фонарик");
    }
    @Override
    public String toString(){
        return "Люис";
    }
}
