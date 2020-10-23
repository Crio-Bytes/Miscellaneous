//class SellerB inherits interface BasePrice
public class SellerB implements BasePrice {

	@Override
	public float calculateShirtPrice(float discountPercentage) {
		
		/* Hint #1:
		 * Calculate actualShirtPrice as-
		 		actualShirtPrice = baseShirtPrice - baseShirtPrice*(discountPercentage/100)
		 * 	If actualShirtPrice is greater than Rs. 800.0 then give extra discount by decreasing it by Rs. 80.0
		 * Return the final value of actualShirtPrice
		 */
	}

	@Override
	public float calculateBagPrice(float discountPercentage) {
		
		/* Hint #2:
		 * Calculate actualBagPrice as-
		 		actualBagPrice = baseBagPrice - baseBagPrice*(discountPercentage/100)
		 * 	If actualBagPrice is greater than Rs 1200.0 then give extra discount by decreasing it by Rs 100.0
		 * Return the final value of actualBagPrice
		 */
	}

	@Override
	public float calculateBill(float priceOfSingleUnit, int quantityPurchased) {
		
		/* Hint #3:
		 * Calculate totalBill as the product of priceOfSingleUnit and quantityPurchased
		 * 	Return the totalBill
		 */
	}
	
}
