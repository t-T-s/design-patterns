/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:06 AM
 */
public class ProxyPatternDemo
{

	public static void main( String[] args )
	{
		Image image = new ProxyImage( "test_10mb.jpg" );

		//image will be loaded from disk
		image.display();
		System.out.println( "" );

		//image will not be loaded from disk
		image.display();
	}
}