/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 11:57 AM
 */
public class Stock
{
	private String name = "ABC";
	private int quantity = 10;

	public void buy(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}
	public void sell(){
		System.out.println("Stock [ Name: "+name+",	Quantity: " + quantity +" ] sold");
	}
}
