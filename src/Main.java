import bodyparts.Legs;
import object.Location;
import enums.Material;
import object.*;
import character.*;

public class Main {
    public static void main(String[] args) {
        Location cemetery = new Location("кладбище");
        Location funeral = new Location("похороны");
        Location planet = new Location("другая планета");
        Clock clock = new Clock(20,0);
        Luis luis = new Luis(100, cemetery, "Люис");
        Luis bill = new Luis(100, funeral, "Билл Батэрмен");
        Entity astronaut = new Entity(100, planet, "Астронавт");
        Gadge gadge = new Gadge(100, funeral, "Гэдж");
        Worm worm = new Worm(100, cemetery, "Червь");
        Rope rope = new Rope(20, cemetery, Material.FABRIC);
        Coffin coffin = new Coffin( 50, cemetery, Material.SILVERY);
        Padlock padlock = new Padlock(200, cemetery, Material.IRON);
        Lantern lantern = new Lantern( 0, cemetery, Material.IRON);
        Shovel shovel = new Shovel(10, cemetery, Material.IRON);
        cemetery.setEntity(luis);
        cemetery.setItems(rope, coffin, lantern, padlock);
        funeral.setEntity(gadge);
        if (gadge.getLocation()==funeral || gadge.getLocation()==cemetery){
            gadge.die();
        }
        worm.know();
        clock.time();
        coffin.getStove().setMaterial(Material.CONCRETE);
        coffin.getStove().openCoffin();
        luis.see(coffin);
        padlock.CHECK();
        rope.isTied();
        rope.holdObject(coffin);
        lantern.setOwner(luis);
        lantern.ON();
        luis.feel(worm);
        luis.feelPain();
        shovel.hit(luis);

        if (luis.equals(astronaut)) {
            Legs legs = new Legs(astronaut);
            legs.explore(planet);
        }
        if (luis.equals(bill)) {
            luis.remember(coffin);
        }
        lantern.OFF();
    }
}