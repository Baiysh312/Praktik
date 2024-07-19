public class Weapon {
    String weaponName;
    int mass;

    public Weapon(String weaponName, int mass) {
        this.weaponName = weaponName;
        this.mass = mass;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
