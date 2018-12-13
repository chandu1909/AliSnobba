package service;

import models.Cart;
import models.Product;

public class CartService {

    Cart cart = new Cart();
    Product product = new Product();



    //adding items to the cart
    public Cart addItem(Product product, int quantity){
        try{
            double price = product.getProductPrice()*quantity;
            cart.setTotalPrice(price);
            cart.setCartEmpty(false);

            System.out.print("Total price is : "+cart.getTotalPrice());

            //grand total gets updated everytime


            return cart;
        }catch (Exception e){
            System.out.println("Exception raised... " +e);
        }
        return cart;
    }


    //deleting items from the cart
    public Cart deleteItem(){
        return cart;
    }

    //update quantity
    public Cart updateQuantity(){

        return cart;
    }
}
