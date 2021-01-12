/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:06 AM
 */
public class RealImage implements Image
{

	private String fileName;

	public RealImage( String fileName )
	{
		this.fileName = fileName;
		loadFromDisk( fileName );
	}

	private void loadFromDisk( String fileName )
	{
		System.out.println( "Loading " + fileName );
	}

	public void display()
	{
		System.out.println( "Displaying " + fileName );
	}
}