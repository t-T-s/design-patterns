/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 11:56 AM
 */
public class CommandPatternDemo
{
	public static void main( String[] args )
	{
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock( abcStock );
		SellStock sellStockOrder = new SellStock( abcStock );

		Broker broker = new Broker();
		broker.takeOrder( buyStockOrder );
		broker.takeOrder( sellStockOrder );

		broker.placeOrders();
	}
}
