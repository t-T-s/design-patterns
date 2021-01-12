/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 7:48 PM
 */
public class Context
{
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}
