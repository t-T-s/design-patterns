/**
 * @author : Thulitha
 * date    : 24 - Oct - 2019
 * time    : 5:28 AM
 */
public class TerminalExpression implements Expression
{
	private String data;

	public TerminalExpression(String data){
		this.data = data;
	}


	public boolean interpret(String context) {

		if(context.contains(data)){
			return true;
		}
		return false;
	}
}
