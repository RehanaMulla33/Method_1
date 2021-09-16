import com.xworkz.methods.AC;

public class Amazon {
	public static void viewProducts() {
		System.out.println("Phones");
		System.out.println("Gadgets");
		System.out.println("Clothes");
		System.out.println("Footwears");
		System.out.println("Jackets");
		System.out.println("Home accessories");
	}

	public static void Order() {
		System.out.println("Order placed successfully");
	}

	public static void Payment() {
		System.out.println("Mode of payment: COD");
	}

	public static void addToCart() {
		System.out.println("Item added to cart");
	}

	public static void addToWishList() {
		System.out.println("Item is added to wish list");
	}

	public static void main(String[] args) {

		System.out.println("......Login to Amazon");
		Amazon.Order();
		Amazon.Payment();
		Amazon.addToCart();
		Amazon.addToWishList();

	}

}
