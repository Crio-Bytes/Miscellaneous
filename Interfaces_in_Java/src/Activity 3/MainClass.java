
public class MainClass {

	public static void main(String[] args) {
		
		/* Hint #1: 
		 * Create an object of class SellerA with name 'objectA'
		 * Create an object of class SellerB with name 'objectB'
		 */

		/* Hint #2(Calling methods of class SellerA): 
		 * 1. Calculate Shirt Price of single unit offered by Seller A with discount 30% and store the results in variable 'shirtPriceBySellerA'
		 * 2. Calculate Bag Price of single unit offered by Seller A with discount 20% and store the results in variable 'bagPriceBySellerA'
		 * 3. Calculate total bill at Seller A (including both bags and shirts) when quantity purchased is 100 shirts and 250 bags and store the result in variable 'totalBill_SellerA'
		 */
		
		/* Hint #3(Calling methods of class SellerB): 
		 * 1. Calculate Shirt Price of single unit offered by Seller B with discount 40% and store the results in variable 'shirtPriceBySellerB'
		 * 2. Calculate Bag Price of single unit offered by Seller B with discount 25% and store the results in variable 'bagPriceBySellerB'
		 * 3. Calculate total bill at Seller B (including both bags and shirts) when quantity purchased is 180 shirts and 220 bags and store the result in variable 'totalBill_SellerB'
		 */
		
		//Use the remaining code as it is for displaying
		System.out.println("----------Seller A----------");
        System.out.println("Shirt price offered : "+ shirtPriceBySellerA);
        System.out.println("Bag Price offered : "+ bagPriceBySellerA);
        System.out.println("Total bill for 100 shirts and 250 bags : "+ totalBill_SellerA);
        
        System.out.println("----------Seller B----------");
        System.out.println("Shirt price offered : "+ shirtPriceBySellerB);
        System.out.println("Bag Price offered : "+ bagPriceBySellerB);
        System.out.println("Total bill for 100 shirts and 250 bags : "+ totalBill_SellerB);
	}

}
