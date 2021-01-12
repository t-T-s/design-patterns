import java.util.Date;

/**
 * @author : Thulitha
 * date    : 22 - Oct - 2019
 * time    : 2:41 PM
 */
public class ChatRoom
{
	public static void showMessage( User user, String message )
	{
		System.out.println( new Date().toString() + " [" + user.getName() + "] : " + message );
	}

}
