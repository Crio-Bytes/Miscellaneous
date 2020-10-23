//class SellerA inherits interface BasePrice
public class SellerA implements BasePrice{
	@Override
	public float calculateShirtPrice(float discountPercentage) {
		/* Hint #1:
		 * Calculate actualShirtPrice as-
		 		actualShirtPrice = baseShirtPrice - baseShirtPrice*(discountPercentage/100)
		 * 	Return the actualShirtPrice
		 */
	}

	@Override
	public float calculateBagPrice(float discountPercentage) {
		/* Hint #2:
		 * Calculate actualBagPrice as-
		 		actualBagPrice = baseBagPrice - baseBagPrice*(discountPercentage/100)
		 * 	Return the actualBagPrice
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
