/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 11:57 AM
 */
public class BuyStock implements Order
{
	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
