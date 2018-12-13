package models;

public class Cart {

    private boolean isCartEmpty = true;
    private int quanity;
    private double totalPrice; //quantity * price which comes from product entity

    public Cart() {

    }

    public boolean isCartEmpty() {
        return isCartEmpty;
    }

    public void setCartEmpty(boolean cartEmpty) {
        isCartEmpty = cartEmpty;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //adding the price to the previous total
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = this.totalPrice + totalPrice;
    }


    public Cart(boolean isCartEmpty, int quanity, double totalPrice) {
        this.isCartEmpty = isCartEmpty;
        this.quanity = quanity;
        this.totalPrice = totalPrice;
    }

    public Cart(int quanity, double totalPrice) {
        this.quanity = quanity;
        this.totalPrice = totalPrice;
    }
}
