public class Main {
    public static void main(String[] args) {

        Bag bag= new Bag(12,"black");
        Bag bag1= new Bag(9,"white");
        Bag bag2= new Bag(8,"red");
        Bag bag3= new Bag(16,"blue");

        Cart cart= new Cart("mountain","y");
        Cart cart1= new Cart("city","gorod");
        Cart cart2= new Cart("jungly","lesa");

        Weapon weapon= new Weapon("AK-47",5);
        Weapon weapon1= new Weapon("Pulemet",7);
        Weapon weapon2= new Weapon("MK-16",4);
        Weapon weapon3= new Weapon("VSS",3);

        Solder solder= new Solder("Alex","shturm",34,bag,weapon);
        Solder solder1= new Solder("Max","pulemetchik",38,bag3,weapon1);
        Solder solder2= new Solder("Alex","shturm",30,bag1,weapon2);
        Solder solder3= new Solder("Alex","sniper",29,bag2,weapon3);

        Oficer oficer = new Oficer("Sania","kapitan",40,bag1,cart);
        Oficer oficer1 = new Oficer("Gosha","leitenant",40,bag,cart);
        Oficer oficer2 = new Oficer("Lenia","kapitan",40,bag3,cart1);
        Oficer oficer3 = new Oficer("Fedia","kapitan",40,bag2,cart2);

        Army army= new Army();
        army.addVoenny(solder);
        army.addVoenny(solder1);
        army.addVoenny(solder2);
        army.addVoenny(solder3);
        army.addVoenny(oficer);

        army.info();
    }
}
