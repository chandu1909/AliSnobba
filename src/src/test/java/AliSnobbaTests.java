/*Tests the models of the application*/

import models.Cart;
import models.Product;
import org.junit.Test;
import org.mockito.Mock;
import service.CartService;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class AliSnobbaTests {



    @Mock
    private CartService mockService;

    //testing adding a new item to the cart
    @Test
    public void TestCart(){
        //assertTrue(true);
        //setup
        Cart expectedResult = new Cart();
        CartService cartService = new CartService();
        Product product = new Product();

        when(mockService.addItem(product,1)).thenReturn(expectedResult);

        //execute
        Cart actualResult = cartService.addItem(product,1);

        //Assert
        assertEquals(expectedResult,actualResult);

        //Teardown

    }

    //deleting item from the cart





}
