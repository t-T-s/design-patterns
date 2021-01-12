/**
 * @author : Thulitha
 * date    : 22 - Oct - 2019
 * time    : 2:42 PM
 */
public class MediatorPatternDemo
{

	public static void main( String[] args )
	{
		User robert = new User( "Robert" );
		User john = new User( "John" );

		robert.sendMessage( "Hi! John!" );
		john.sendMessage( "Hello! Robert!" );
	}
}
