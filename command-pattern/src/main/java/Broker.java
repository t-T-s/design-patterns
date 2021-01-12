import java.util.ArrayList;
import java.util.List;

/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 11:56 AM
 */
public class Broker
{
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order){
		orderList.add(order);
	}

	public void placeOrders(){

		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
