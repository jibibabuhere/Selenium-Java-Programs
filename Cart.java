package arraylist;
import java.util.ArrayList;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   ArrayList<String> cart = new ArrayList<>();

	        cart.add("Laptop");
	        cart.add("Bag");
	        cart.add("Mobile");
	        cart.add("Mouse");
	        cart.add("Pendrive");

	        System.out.println("Cart Items: " + cart);


	        if (cart.contains("Laptop")) {

	            System.out.println("Laptop is available");

	        } else {

	            System.out.println("Laptop is not available");
	        }
	        
	        
	        System.out.println("Products in Cart:");

	        for (String product : cart) {

	            System.out.println(product);
	        }

	}

}
