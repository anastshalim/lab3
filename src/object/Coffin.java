package object;
import character.Entity;
import enums.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Coffin extends Item{
    private Entity owner;
    private int damage;
    private Stove stove;
    protected ArrayList<CoffinCondition> characteristics = new ArrayList<>();
    public static class Stove extends Item{
        private boolean raise = false;
        private Material material;

        public Stove(int damage, Location location, Material material) {
            super(damage, location, material);
        }

        public Material getMaterial() {
            return material;
        }
        public boolean getRaise() {
            return raise;
        }
        public void setMaterial(Material material) {
            this.material = material;
        }

        public void openCoffin(){
            this.raise = true;
            System.out.println(getMaterial()+ " крышка " + "поднята");
        }
        @Override
        public String toString(){
            return "гроб";
        }
    }


    public Coffin(int damage, Location location, Material material) {
        super(damage, location, material);
        this.stove= new Stove(damage, location, material);
        }
    public void addCondition(CoffinCondition... characteristics) {
        this.characteristics.addAll(Arrays.asList(characteristics));
    }
    public Entity getOwner(){
        return owner;
    }

    public void setOwner(Entity owner) {
        this.owner= owner;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Stove getStove() {
        return stove;
    }

}
