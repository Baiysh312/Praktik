public class Solder extends Voennyi{
     Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public Solder(String name, String zvanie, int year, Bag bag, Weapon weapon) {
        super(name, zvanie, year, bag);
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void Gun(){
         System.out.println("solder gun "+weapon.weaponName);
     }
}
