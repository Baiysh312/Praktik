public class Oficer extends Voennyi{
    Cart cart;


    public Oficer(String name, String zvanie, int year, Bag bag, Cart cart) {
        super(name, zvanie, year, bag);
        this.cart = cart;
    }

    public void Comandovat(){
        System.out.println("comand po "+ cart.operation+" na carte "+cart);
    }
}
