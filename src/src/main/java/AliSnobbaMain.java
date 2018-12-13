import models.Cart;
import models.LineItem;
import models.Product;
import service.CartService;

public class AliSnobbaMain {

    public static void main(String args[]){

        //since not using spring..creating objects explicitly
        Product product = new Product();
        LineItem lineItem = new LineItem();
        Cart cart = new Cart();

        CartService cartService = new CartService();

        cartService.addItem(product,1);


    }
}
