package app;
import model.Cart;
public class Demo{
public static void main (String args[]){

Cart cart = new Cart();

        cart.addItem(120);
        cart.addItem(50, 3);

        System.out.println("Cart total: Rs " + cart.getTotal());
    
}
}